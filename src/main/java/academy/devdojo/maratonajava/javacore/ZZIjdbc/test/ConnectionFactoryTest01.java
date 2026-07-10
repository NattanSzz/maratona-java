package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import java.sql.SQLException;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        // Producer producer = Producer.builder().name("Studio Deen").build();
        // Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();

        // ProducerService.save(producer);
        // ProducerService.delete(4);
        // ProducerService.update(producerToUpdate);

        // List<Producer> producers = ProducerService.findAll();
        // log.info("Producers found '{}'", producers);

        // List<Producer> producers = ProducerService.findByName("MAD");
        // log.info("Producers found '{}'", producers);

        // ProducerService.showProducerMetaData();

        ProducerService.showDriverMetaData();
    }
}
