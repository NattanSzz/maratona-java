package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Book;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BookRepository {
    public static List<Book> findByName(String name) {
        log.info("Finding Book by Name");
        List<Book> books = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepaedStatementFindByName(conn, name);
                ResultSet rs = ps.executeQuery()) {
            
            while(rs.next()){
                Producer producer = Producer.builder()
                    .id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();
                Book book = Book
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .chapters(rs.getInt("chapters"))
                    .producer(producer)
                    .build();
                books.add(book);
            }
        }catch(SQLException e) {
            log.error("Error while trying to find all books", e);
        }
        return books;
    }

    private static PreparedStatement createPrepaedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
            SELECT a.id, a.name, a.chapters, a.producer_id, p.name as 'producer_name' FROM book_store.book a inner join
            book_store.producer p on a.producer_id = p.id
            where a.name like ?;
            """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Book> findById(Integer id) {
        log.info("Finding Book by Id");
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepaedStatementFindById(conn, id);
                ResultSet rs = ps.executeQuery()) {
            if(!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                .id(rs.getInt("producer_id"))
                .name(rs.getString("producer_name"))
                .build();
            Book book = Book
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .chapters(rs.getInt("chapters"))
                .producer(producer)
                .build();
            return Optional.of(book);
        }catch(SQLException e) {
            log.error("Error while trying to find all books", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepaedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
            SELECT a.id, a.name, a.chapters, a.producer_id, p.name as 'producer_name' FROM book_store.book a inner join
            book_store.producer p on a.producer_id = p.id
            where a.id = ?;
            """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepaedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted book '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete book '{}'", id);
        }
    }

    private static PreparedStatement createPrepaedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `book_store`.`book` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Book book) {
        log.info("Saving book '{}'", book.getName());
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPreparedStatementSave(conn, book)) {
            ps.execute();
        }catch(SQLException e) {
            log.error("Error while trying to save book", e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Book book) throws SQLException {
        String sql = "INSERT INFO `book_store`.`book` (`name`, `chapters`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, book.getName());
        ps.setInt(2, book.getChapters());
        ps.setInt(3, book.getProducer().getId());
        return ps;
    }

    public static void update(Book book) {
        log.info("Updating book '{}'", book);
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPreparedStatementUpdate(conn, book)){
            ps.execute();
        }catch(SQLException e) {
            log.error("Error while trying to update book", e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Book book) throws SQLException {
        String sql = "UPDATE `anime_store`.`book` SET `name` = ?, `chapters` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, book.getName());
        ps.setInt(2, book.getChapters());
        ps.setInt(3, book.getId());
        return ps;
    }
}
