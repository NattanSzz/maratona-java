package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;

public class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService service;
    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        service = new PersonService();
    }
    @Test
    void testIsAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(service.isAdult(notAdult));
    }

    @Test
    void testIsAdult_ReturnTrue_WhenAgeIsGreatterOrEqualsThan18() {
        Assertions.assertTrue(service.isAdult(adult));
    }
}
