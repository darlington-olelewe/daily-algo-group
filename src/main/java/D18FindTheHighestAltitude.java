public class D18FindTheHighestAltitude {
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
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr = 0;
        for(int g: gain){
            curr = curr + g;
            max = Math.max(curr, max);
        }
        return max;
    }
}
