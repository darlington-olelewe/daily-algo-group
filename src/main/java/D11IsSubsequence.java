public class D11IsSubsequence {
    /**
     * Code         392
     * Difficulty   easy
     * Question     Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     *              A subsequence of a string is a new string that is formed from the original string by deleting some
     *              (can be none) of the characters without disturbing the relative positions of the remaining characters.
     *              (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     *
     * link = "https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public boolean isSubsequence(String s, String t) {

        int end = t.length();
        if(s.isEmpty()){
            return true;
        }
        if(s.length() > end){
            return false;
        }

        int count = 0;
        for(int i = 0; i < end; i++){
            if(count == s.length()){
                return true;
            }
            if(t.charAt(i) == s.charAt(count)){
                count++;
            }
        }

        return count == s.length();
    }
}


