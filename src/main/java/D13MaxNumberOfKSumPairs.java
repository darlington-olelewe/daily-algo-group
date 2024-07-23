import java.util.Arrays;

public class D13MaxNumberOfKSumPairs {

    /**
     * Code         1679
     * Difficulty   medium
     * Question     You are given an integer array nums and an integer k.
     *              In one operation, you can pick two numbers from the array
     *              whose sum equals k and remove them from the array.
     *              Return the maximum number of operations you can perform on the array.

     * link = "https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;

        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int target = k - nums[left];
            if(nums[right] == target){
                count++;
                right--;
                left++;
            }else if(nums[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
