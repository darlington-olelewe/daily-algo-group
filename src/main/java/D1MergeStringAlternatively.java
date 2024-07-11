public class D1MergeStringAlternatively {
    /**
     * Code         1768
     * Difficulty   easy
     * Question     You are given two strings word1 and word2. Merge the
     *              strings by adding letters in alternating order, starting
     *              with word1. If a string is longer than the other,
     *              append the additional letters onto the end of the merged string.
     *              Return the merged string.
     * link = "https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75"
     * todo         Drop copy and paste the content of method/function into the solution section on leetcode
     */

    public String mergeAlternately(String word1, String word2) {
        int aLength = word1.length();
        int bLength = word2.length();
        int len = Math.max(aLength, bLength);
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < len; i++){
            if(i < aLength){
                sb.append(word1.charAt(i));
            }
            if(i < bLength){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();

    }




}
