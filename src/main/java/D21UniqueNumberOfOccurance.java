import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D21UniqueNumberOfOccurance {
    /**
     * Code         1207
     * Difficulty   easy
     * Question     Given an array of integers arr, return true if the number of occurrences of
     *              each value in the array is unique or false otherwise.
     *
     * link = "https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75"
     */

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            if(map.containsKey(i)){
                int current = map.get(i);
                map.put(i, current + 1);
            }else{
                map.put(i, 1);
            }
        }
        Set<Integer> set = new HashSet<>();

        for(Integer i: map.values()){
            set.add(i);
        }

        return map.values().size() == set.size();

    }
}

