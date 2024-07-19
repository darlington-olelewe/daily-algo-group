public class D9StringCompression {

    /**
     * Code         443
     * Difficulty   medium
     * Question     Given an array of characters chars, compress it using the following algorithm:
     *              Begin with an empty string s. For each group of consecutive repeating characters in chars:
     *              If the group's length is 1, append the character to s.
     *              Otherwise, append the character followed by the group's length.
     *              The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
     *              Note that group lengths that are 10 or longer will be split into multiple characters in chars.
     *              After you are done modifying the input array, return the new length of the array.
     *              You must write an algorithm that uses only constant extra space.
     *
     * link = "https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int compress(char[] chars) {

        int currentPosted = 0;
        int uniqueCount = 1;
        char currentValue = chars[0];
        int count=1;
        for(int i = 1; i < chars.length; i++){
            char temp = chars[i];
            if(temp != currentValue){

                if(uniqueCount > 1){

                    char[] j = String.valueOf(uniqueCount).toCharArray();
                    for(char k: j){
                        chars[++currentPosted] = k;
                        count++;
                    }

                }

                chars[++currentPosted] = temp;
                count++;
                uniqueCount = 1;
                currentValue = temp;

            }else{
                uniqueCount++;
            }

        }

        if(uniqueCount > 1){
            char[] j = String.valueOf(uniqueCount).toCharArray();
            for(char k: j){
                chars[++currentPosted] = k;
                count++;
            }
        }

        return count;
    }
}
