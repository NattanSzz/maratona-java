package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO book_store.producer (name) VALUES ('%s')".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName());
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `book_store`.`producer` WHERE `id` = %d;".formatted(id);
        try(Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id);
            e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `book_store`.`producer` SET `name` = '%s' WHERE (`id` = %d);".formatted(producer.getName(), producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}', rows affected {}", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId());
            e.printStackTrace();
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM book_store.producer;";
        List<Producer> producers = new ArrayList<>();

        try(Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()) {
                Producer producer = Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers'");
            e.printStackTrace();
        }
        
        return producers;
    }
}
