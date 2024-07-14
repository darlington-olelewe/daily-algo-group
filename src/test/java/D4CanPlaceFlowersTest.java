import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class D4CanPlaceFlowersTest {
    private final D4CanPlaceFlowers canPlaceFlowers = new D4CanPlaceFlowers();
    @Test
    void canPlaceFlowers_testCaseOne() {

        int[] arg1 = {1,0,0,0,1};
        int arg2 = 1;

        boolean expected = true;
        boolean actual = canPlaceFlowers.canPlaceFlowers(arg1,arg2);
        assertEquals(expected, actual);
    }
    @Test
    void canPlaceFlowers_testCaseTwo() {

        int[] arg1 = {1,0,0,0,1};
        int arg2 = 2;

        boolean expected = false;
        boolean actual = canPlaceFlowers.canPlaceFlowers(arg1,arg2);
        assertEquals(expected, actual);
    }
}