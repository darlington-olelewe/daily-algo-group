import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D6ReverseWordsTest {
    D6ReverseWords reverseWords = new D6ReverseWords();

    @Test
    void reverseWords_testCaseOne() {
        String arg1 = "the sky is blue";
        String expected = "blue is sky the";
        String actual = reverseWords.reverseWords(arg1);
        assertEquals(expected, actual);
    }

    @Test
    void reverseWords_testCaseTwo() {
        String arg1 = "  hello world  ";
        String expected = "world hello";
        String actual = reverseWords.reverseWords(arg1);
        assertEquals(expected, actual);
    }

    @Test
    void reverseWords_testCaseThree() {
        String arg1 = "a good   example";
        String expected = "example good a";
        String actual = reverseWords.reverseWords(arg1);
        assertEquals(expected, actual);
    }
}