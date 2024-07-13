import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class D3KidsWithTheGreatestNumberOfCandiesTest {
    private D3KidsWithTheGreatestNumberOfCandies kidsWithCandies = new D3KidsWithTheGreatestNumberOfCandies();
    @Test
    void kidsWithCandies_testCaseOne() {
        int[] arg1 = {2,3,5,1,3};
        int arg2 = 3;

        List<Boolean> expected = List.of(true, true, true, false, true);
        List<Boolean> actual = kidsWithCandies.kidsWithCandies(arg1, arg2);

        assertEquals(expected, actual);

    }
    @Test
    void kidsWithCandies_testCaseTwo() {
        int[] arg1 = {4,2,1,1,2};
        int arg2 = 1;

        List<Boolean> expected = List.of(true,false,false,false,false);
        List<Boolean> actual = kidsWithCandies.kidsWithCandies(arg1, arg2);

        assertEquals(expected, actual);

    }
    @Test
    void kidsWithCandies_testCaseThree() {
        int[] arg1 = {12,1,12};
        int arg2 = 10;

        List<Boolean> expected = List.of(true,false,true);
        List<Boolean> actual = kidsWithCandies.kidsWithCandies(arg1, arg2);

        assertEquals(expected, actual);

    }
}