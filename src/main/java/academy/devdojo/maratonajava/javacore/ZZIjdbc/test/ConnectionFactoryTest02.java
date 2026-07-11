package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        // List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        // log.info("Producers '{}'", producers);

        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
    }
}
