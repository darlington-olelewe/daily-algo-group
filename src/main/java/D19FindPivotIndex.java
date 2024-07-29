public class D19FindPivotIndex {

    /**
     * Code         724
     * Difficulty   easy
     * Question     Given an array of integers nums, calculate the pivot index of this array.
     *              The pivot index is the index where the sum of all the numbers strictly to the
     *              left of the index is equal to the sum of all the numbers strictly to the index's right.
     *              If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
     *              This also applies to the right edge of the array.
     *              Return the leftmost pivot index. If no such index exists, return -1.
     *
     * link = "https://leetcode.com/problems/find-pivot-index/submissions/1333948741/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n: nums){ sum += n;}

        int left = 0;
        int right = sum - nums[0];
        if(left == right){
            return 0;
        }

        for(int i  = 1; i < nums.length; i++){


            left += nums[i-1];
            right -= nums[i];

            if(left == right){
                return i;
            }

        }
        return -1;
    }


}
