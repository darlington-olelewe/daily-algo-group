public class D15MaximumNumberOfVowelInASubstringOfGivenLength {
    /**
     * Code         1456
     * Difficulty   medium
     * Question     Given a string s and an integer k, return the maximum number of vowel letters in
     *              any substring of s with length k.
     *              Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     * link = "https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int maxVowels(String s, int k) {


        char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(chars[i])){
                count++;
            }
        }

        max = Math.max(max, count);

        int pointer = 0;

        for(int i = k; i < chars.length; i++){

            if(isVowel(chars[i])){
                count++;
            }

            if(isVowel(chars[pointer++])){
                count--;
            }

            max = Math.max(max, count);


        }

        return max;

    }


    public boolean isVowel(char c){

        switch(c){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default :
                return false;
        }

    }
}
