public class D12ContainerWithMostWater {
    /**
     * Code         11
     * Difficulty   medium
     * Question     You are given an integer array height of length n. There are n vertical lines drawn such that
                    the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the
                    x-axis form a container, such that the container contains the most water.
                    Return the maximum amount of water a container can store.
                    Notice that you may not slant the container.

     * link = "https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length -1;

        while(left < right){
            int distance = right - left;
            int minHeight = Math.min(height[right], height[left]);
            int waterContent = minHeight * distance;

            max = Math.max(waterContent, max);

            while(left < right && (height[left] <= minHeight)){
                left++;
            }
            while(left < right && (height[right] <= minHeight)){
                right--;
            }
        }

        return max;

    }


}
