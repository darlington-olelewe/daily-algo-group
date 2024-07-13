import java.util.ArrayList;
import java.util.List;

public class D3KidsWithTheGreatestNumberOfCandies {
    /**
     * Code         1431
     * Difficulty   easy
     * Question     There are n kids with candies. You are given an integer array
     *              candies, where each candies[i] represents the number of candies the ith kid has,
     *              and an integer extraCandies, denoting the number of extra candies that you have.
     *              Return a boolean array result of length n, where result[i] is true if, after giving the i
     *              th kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
     * Note         multiple kids can have the greatest number of candies.
     * link = "https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75"
     * todo         Drop copy and paste the content of method/function into the solution section on leetcode
     */

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxValue = 0;
        for(int n: candies){
            maxValue = Math.max(maxValue, n);
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        for(int n: candies){
            int temp = n + extraCandies;
            result.add(temp >= maxValue);
        }

        return result;
    }
}
