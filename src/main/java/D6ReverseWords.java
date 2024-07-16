public class D6ReverseWords {

    /**
     * Code         151
     * Difficulty   medium
     * Question     Given an input string s, reverse the order of the words.
     *              A word is defined as a sequence of non-space characters.
     *              The words in s will be separated by at least one space.
     *              Return a string of the words in reverse order concatenated by a single space.
     *              Note that s may contain leading or trailing spaces or multiple spaces between two words.
     *              The returned string should only have a single space separating the words. Do not include any extra spaces.
     *
     * link = "https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75"
     * todo        copy and paste the contents (line 14 to line 78) into the solution section on leetcode
     */
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        int end = arr.length - 1;

        for(int i = end; i >= 0; i--){

            if(!arr[i].isEmpty()){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
