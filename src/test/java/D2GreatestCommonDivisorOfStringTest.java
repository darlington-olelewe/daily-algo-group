import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class D2GreatestCommonDivisorOfStringTest {

    private D2GreatestCommonDivisorOfString gcd = new D2GreatestCommonDivisorOfString();

    @Test
    public void gcdOfStrings_toReturn_ABC() {

        String str1 = "ABCABC";
        String str2 = "ABC";

        String expected = gcd.gcdOfStrings(str1,str2);
        String actual = "ABC";

        assertEquals(expected, actual);
    }

    @Test
    public void gcdOfStrings_toReturn_AB() {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        String expected = gcd.gcdOfStrings(str1,str2);
        String actual = "AB";

        assertEquals(expected, actual);
    }
    @Test
    public void gcdOfStrings_toReturn_empty() {
        String str1 = "LEET";
        String str2 = "CODE";

        String expected = gcd.gcdOfStrings(str1,str2);
        String actual = "";

        assertEquals(expected, actual);
    }
}