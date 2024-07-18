import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D8IncreasingTripletSubsequenceTest {
    private final D8IncreasingTripletSubsequence increasingTripletSubsequence = new D8IncreasingTripletSubsequence();
    @Test
    void increasingTriplet_testCaseOne() {
        int[] args = {1,2,3,4,5};
        boolean expected = true;
        boolean actual = increasingTripletSubsequence.increasingTriplet(args);
        assertEquals(expected, actual);
    }
    @Test
    void increasingTriplet_testCaseTwo() {
        int[] args = {5,4,3,2,1};
        boolean expected = false;
        boolean actual = increasingTripletSubsequence.increasingTriplet(args);
        assertEquals(expected, actual);
    }
    @Test
    void increasingTriplet_testCaseThree() {
        int[] args = {2,1,5,0,4,6};
        boolean expected = true;
        boolean actual = increasingTripletSubsequence.increasingTriplet(args);
        assertEquals(expected, actual);
    }

}