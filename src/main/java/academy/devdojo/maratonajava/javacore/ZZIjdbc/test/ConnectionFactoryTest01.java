package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import java.sql.SQLException;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.ProducerBuilder.builder()
            .name("NHK")
            .build();
        ProducerRepository.save(producer);
    }
}
