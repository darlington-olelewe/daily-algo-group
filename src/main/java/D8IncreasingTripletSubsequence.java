public class D8IncreasingTripletSubsequence {

    /**
     * Code         334
     * Difficulty   medium
     * Question     Given an integer array nums, return true if there exists a triple of indices (i, j, k)
     *              such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
     *
     * link = "https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public boolean increasingTriplet(int[] nums) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMin) {
                firstMin = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
