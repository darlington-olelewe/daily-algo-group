import java.util.ArrayList;
import java.util.List;

public class D16MaxConsecutiveOnesIII {
    /**
     * Code         1004
     * Difficulty   medium
     * Question     Given a binary array nums and an integer k, return the maximum number
     *              of consecutive 1's in the array if you can flip at most k 0's.
     * link = "https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int longestOnes(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i  = 0; i < nums.length; i++){
            int curr =  nums[i];
            if(curr == 0){
                if(i == 0){
                    list.add(0);
                }else if(nums[i-1] == 0){
                    list.add(0);
                    count = 0;
                }else{
                    list.add(count);
                    count = 0;
                    list.add(0);

                }
            }else{
                count++;
            }

        }
        if(nums[nums.length - 1] == 1){
            list.add(count);
        }

        int maxValue = 0;
        int zeros = 0;
        int holder = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = i; j < list.size(); j++){
                int value = list.get(j);
                if(value == 0){
                    if(zeros == k){
                        break;
                    }
                    holder++;
                    zeros++;
                }else{
                    holder += value;
                }
            }
            maxValue = Math.max(maxValue, holder);
            holder = 0;
            zeros = 0;

        }
        return maxValue;
    }

}
