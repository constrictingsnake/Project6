/*
* Class: CMSC201
* Instructor: Professor Grinberg
* Description: Tests the Java-provided String class
* Due: 05/06/24
* I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 I have not given my code to any student.
 Print your Name here: Aarav Verma
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Testing whether the String class in Java works
 * @author Aarav Verma
 * @version 1.0
 */
public class StringTest {

    /**
     * Static variable that will be used to test these methods
     */
    static String test = "Hello";

    /**
     * Asks for length of test to check if the length() function works
     *
     */
    @Test
    public void testLength() {
        assertEquals(5, test.length());
    }

    /**
     * Asks for a character at a specific index to check if the chatAt() function works
     *
     */
    @Test
    public void testCharAt() {
        assertEquals('H', test.charAt(0));
    }

    /**
     * Asks for a substring at a specific index to check if the substring() function works
     *
     */
    @Test
    public void testSubstring() {
        assertEquals("He", test.substring(0, 2));
    }

    /**
     * Searches for the index of a character to check if the indexOf() function works
     *
     */
    @Test
    public void testIndexOf() {
        assertEquals(4, test.indexOf('o'));
    }
}
