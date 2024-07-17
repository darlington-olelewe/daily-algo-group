import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class D7ProductOfArrayExceptSelfTest {
    private D7ProductOfArrayExceptSelf productOfArrayExceptSelf = new D7ProductOfArrayExceptSelf();
    @Test
    void productExceptSelf_testCaseOne() {


        int[] arg1 = {1,2,3,4};

        int [] expected = {24,12,8,6};
        int[] actual = productOfArrayExceptSelf.productExceptSelf(arg1);
        assertEquals(Arrays.hashCode(expected), Arrays.hashCode(actual));

    }

    @Test
    void productExceptSelf_testCaseTwo() {


        int[] arg1 = {-1,1,0,-3,3};

        int [] expected = {0,0,9,0,0};
        int[] actual = productOfArrayExceptSelf.productExceptSelf(arg1);
        assertEquals(Arrays.hashCode(expected), Arrays.hashCode(actual));

    }
}