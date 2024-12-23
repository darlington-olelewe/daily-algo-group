public class D17LongestSubArrayOf1sAfterDeletingOneElement {
    /**
     * Code         1493
     * Difficulty   medium
     * Question     Given a binary array nums, you should delete one element from it.
     *              Return the size of the longest non-empty subarray containing only 1's in the resulting array.
     *              Return 0 if there is no such subarray.
     *
     * link = "https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int longestSubarray(int[] nums) {
        int lastIndex = -1;
        int maxOnes = 0;
        int count = 0;
        boolean isUsed = false;

        for(int i = 0; i < nums.length; i++){

            int curr = nums[i];

            if(curr == 0 && lastIndex == -1){
                lastIndex = i;
                isUsed = true;
            }else if(curr == 0 && lastIndex >= 0){
                maxOnes = Math.max(maxOnes, count);
                count = i - lastIndex - 1;
                lastIndex = i;

            }else if(curr == 1){
                count++;
            }

        }
        maxOnes = Math.max(maxOnes, count);

        if(!isUsed){
            return maxOnes - 1;
        }

        return maxOnes;

    }
}
