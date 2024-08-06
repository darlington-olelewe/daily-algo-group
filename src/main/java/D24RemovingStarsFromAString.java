public class D24RemovingStarsFromAString {
    /**
     * Code         2390
     * Difficulty   medium
     * Question     You are given a string s, which contains stars *.
                    In one operation, you can:
                        Choose a star in s.
                        Remove the closest non-star character to its left, as well as remove the star itself.
                        Return the string after all stars have been removed.
                    Note:
                        The input will be generated such that the operation is always possible.
                        It can be shown that the resulting string will always be unique.
     *
     * link = "https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75"
     */

    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        int deleteCount = 0;
        int len = s.length() - 1;
        for(int i = len ; i > -1; i--){
            char temp = s.charAt(i);
            if(temp == '*'){
                deleteCount++;
            }else if(deleteCount == 0){
                sb.append(temp);
            }else{
                deleteCount--;
            }

        }

        return sb.reverse().toString();
    }



}
