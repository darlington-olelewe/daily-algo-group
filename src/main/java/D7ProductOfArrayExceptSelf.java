import java.util.Arrays;

public class D7ProductOfArrayExceptSelf {

    /**
     * Code         238
     * Difficulty   medium
     * Question     Given an integer array nums, return an array answer such that answer[i] is equal to the product
     *              of all the elements of nums except nums[i].
     *              The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *              You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     * link = "https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75"
     * todo        copy and paste the contents (line 15 to line 55) into the solution section on leetcode
     */


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }


    public int[] productExceptSelf_with_Division(int[] nums) {
        int allProduct = product(nums);
        int[] solution = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                solution[i] = productOffAllExcept(nums,i);
            }else{
                solution[i] = allProduct / nums[i];
            }

        }

        return solution;
    }

    public int product(int[] nums){
        int result = 1;

        for(int i: nums){
            result *= i;
        }

        return result;
    }

    public int productOffAllExcept(int[] num, int except){

        int result = 1;
        num[except] = 1;

        for(int i: num){
            result *= i;
        }

        num[except] = 0;

        return result;

    }
}
