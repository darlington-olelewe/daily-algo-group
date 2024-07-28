public class D18FindTheHighestAltitude {

    public int longestSubarray(int[] nums) {
        /**
         * Code         1732
         * Difficulty   easy
         * Question     There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
         *              The biker starts his trip on point 0 with altitude equal 0.
         *              You are given an integer array gain of length n where gain[i] is the net gain in altitude between
         *              points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
         *
         * link = "https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75"
         */
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
