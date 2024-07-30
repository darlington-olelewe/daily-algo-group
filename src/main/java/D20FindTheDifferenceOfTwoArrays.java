import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class D20FindTheDifferenceOfTwoArrays {

    /**
     * Code         2215
     * Difficulty   easy
     * Question     Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
     *              answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
     *              answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
     *              Note that the integers in the lists may be returned in any order.
     *
     * link = "https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75"
     */


    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> aSet = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> bSet = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(Integer i: aSet){

            if(!bSet.contains(i)){
                a.add(i);
            }

        }

        for(Integer i: bSet){

            if(!aSet.contains(i)){
                b.add(i);
            }

        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(a);
        result.add(b);

        return result;
    }
}
