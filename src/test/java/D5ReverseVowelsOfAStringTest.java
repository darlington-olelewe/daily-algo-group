import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D5ReverseVowelsOfAStringTest {

    private final D5ReverseVowelsOfAString reverseVowelsOfAString = new D5ReverseVowelsOfAString();

    @Test
    void reverseVowels_testCaseOne() {

        String arg1 = "hello";
        String expected = "holle";
        String actual = reverseVowelsOfAString.reverseVowels(arg1);
        assertEquals(expected, actual);
    }
    @Test
    void reverseVowels_testCaseTwo() {

        String arg1 = "leetcode";
        String expected = "leotcede";
        String actual = reverseVowelsOfAString.reverseVowels(arg1);
        assertEquals(expected, actual);
    }
}