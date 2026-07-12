package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GibiTest {
    private Gibi gibi1;
    private Gibi gibi2;

    @BeforeEach
    public void setUp() {
        gibi1 = new Gibi("Turma da Monica", 24);
        gibi2 = new Gibi("Turma da Monica", 24);
    }

    @Test
    void acessors_ReturnData_WhenInitialized() {
        Assertions.assertEquals("Turma da Monica", gibi1.name());
        Assertions.assertEquals(24, gibi1.chapters());
    }

    @Test
    void equals_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(gibi2, gibi1);
    }
}
