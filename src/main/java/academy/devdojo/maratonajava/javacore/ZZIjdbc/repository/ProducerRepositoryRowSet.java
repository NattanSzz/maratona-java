package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM book_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                    .id(jrs.getInt("id"))
                    .name(jrs.getString("name"))
                    .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "UPDATE `book_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.setCommand(sql);
            jrs.setString(1, producer.getName());
            jrs.setInt(2, producer.getId());
            jrs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
