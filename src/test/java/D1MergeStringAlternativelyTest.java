import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D1MergeStringAlternativelyTest {
    D1MergeStringAlternatively toTest = new D1MergeStringAlternatively();
    @BeforeEach
    void setUp() {
    }

    @Test
    void mergeAlternately_should_return_apbqcr() {
        String actual = toTest.mergeAlternately("abc", "pqr");
        String expected = "apbqcr";
        assertEquals(expected, actual);
    }

    @Test
    void mergeAlternately_should_return_apbqrs() {
        String actual = toTest.mergeAlternately("ab", "pqrs");
        String expected = "apbqrs";
        assertEquals(expected, actual);
    }
}