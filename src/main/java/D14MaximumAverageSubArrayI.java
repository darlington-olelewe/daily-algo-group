public class D14MaximumAverageSubArrayI {
    /**
     * Code         643
     * Difficulty   easy
     * Question     You are given an integer array nums consisting of n elements, and an integer k.
     *              Find a contiguous subarray whose length is equal to k that has the maximum
     *              average value and return this value. Any answer with a calculation error less
     *              than 10-5 will be accepted.
     * link = "https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public double findMaxAverage(int[] nums, int k) {

        double maxValue = Double.NEGATIVE_INFINITY;

        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        maxValue = Math.max(maxValue, sum / k);

        int backTracker = 0;

        for(int i = k; i < nums.length; i++){
            sum += nums[i];
            sum -= nums[backTracker++];
            maxValue = Math.max(maxValue, sum / k);
        }

        return maxValue;

    }
}

