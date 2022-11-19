package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerSuccessTest {

private Passenger myPassenger;
    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "John Doe", 1234334567891L, 1233456789, 42);
    }

    @Test
    void testTitlePass(){
        assertEquals("Mr", myPassenger.getTitle());
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());

    }

    @Test
    void testNamePass(){
        assertEquals("John Doe", myPassenger.getName());
    }

    @Test
    void testIdPass(){
        assertEquals(1234334567891L, myPassenger.getId());
    }

    @Test
    void testPhonePass(){
        assertEquals(1233456789, myPassenger.getPhone());
    }

    @Test
    void testAgePass(){
        assertEquals(42, myPassenger.getAge());
    }

}
