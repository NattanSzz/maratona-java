package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import java.sql.SQLException;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        // Producer producer = Producer.builder()
        //     .name("Studio Deen")
        //     .build();
        // ProducerRepository.save(producer);

        log.info("INFO");
        log.debug("INFO");
        log.warn("INFO");
        log.error("INFO");
        log.trace("INFO");

    }
}
