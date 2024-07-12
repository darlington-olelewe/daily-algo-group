public class D2GreatestCommonDivisorOfString {
    /**
     * Code         1071
     * Difficulty   easy
     * Question     For two strings s and t, we say "t divides s" if and only
     *              if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
     *              Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     * link = "https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75"
     * todo         Drop copy and paste the content of method/function into the solution section on leetcode
     */

    public String gcdOfStrings(String str1, String str2) {

        int left = str1.length();
        int right = str2.length();

        if(right > left)
            return gcdOfStrings(str2,str1);

        if(str1.equals(str2))
            return str1;


        if(str1.startsWith(str2))
            return gcdOfStrings(str2, str1.substring(str2.length()));

        return "";

    }
}
