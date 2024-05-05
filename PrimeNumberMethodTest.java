/*
* Class: CMSC201
* Instructor: Professor Grinberg
* Description: Tests the Project-provided PrimeNumber method
* Due: 05/06/24
* I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 I have not given my code to any student.
 Print your Name here: Aarav Verma
*/
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing whether the Prime Number Method actually works
 * @author Aarav Verma
 * @version 1.0
 */
public class PrimeNumberMethodTest {

    /**
     * Passes numerous variables to the method in order to check if it returns the right value
     *
     */
    @Test
    public void testIsPrime() {

        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(7));

        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(6));
        assertFalse(PrimeNumberMethod.isPrime(8));
        assertFalse(PrimeNumberMethod.isPrime(10));
    }

}
