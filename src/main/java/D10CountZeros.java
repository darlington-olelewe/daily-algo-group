import java.util.Arrays;

public class D10CountZeros {
    /**
     * Code         283
     * Difficulty   easy
     * Question     Given an integer array nums, move all 0's to the end of it while maintaining the relative order
     *              of the non-zero elements.
     *              Note that you must do this in-place without making a copy of the array.
     *
     * link = "https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public void moveZeroes(int[] nums) {

        int zeroCount = 0;
        int nonZeroIndex = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount += 1;
            } else {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        Arrays.fill(nums,nums.length - zeroCount,nums.length,0);

    }
}
