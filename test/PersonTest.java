import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p ;
    @BeforeEach
    void setUp() {
        p = new Person("PEPE" , "correo");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getdni() {
        assertEquals("PEPE", p.getdni());
    }

    @Test
    void setdni() {
    }

    @Test
    void getCorreo() {
    }

    @Test
    void setCorreo() {
    }

    @org.junit.jupiter.api.Test
    void testGetdni() {
    }

    @org.junit.jupiter.api.Test
    void testSetdni() {
    }

    @org.junit.jupiter.api.Test
    void testGetCorreo() {
    }

    @org.junit.jupiter.api.Test
    void testSetCorreo() {
    }
}