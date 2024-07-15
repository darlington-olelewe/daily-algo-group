public class D5ReverseVowelsOfAString {

    /**
     * Code         345
     * Difficulty   easy
     * Question     Given a string s, reverse only all the vowels in the string and return it.
     *              The vowels are 'a', 'e', 'i', 'o', and 'u',
     *              and they can appear in both lower and upper cases, more than once.
     *
     * link = "https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75"
     * todo        copy and paste the contents (line 14 to line 78) into the solution section on leetcode
     */

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int leftPointer = -1;
        int rightPointer = chars.length;

        while(leftPointer < rightPointer){

            leftPointer = nextLeft(leftPointer, rightPointer, chars);
            rightPointer = nextRight(rightPointer, leftPointer, chars);
            if(leftPointer == -1 | rightPointer == -1) break;
            swap(leftPointer, rightPointer, chars);

        }

        return new String(chars);
    }

    public void swap(int left, int right, char[] arr){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public int nextLeft(int currentLeft, int right, char[] arr){

        for(int i = currentLeft + 1; i < right; i++){
            char temp = arr[i];
            boolean isVowel = isVowel(temp);
            if(isVowel) return i;
        }

        return -1;
    }

    public int nextRight(int currentRight, int left, char[] arr){

        for(int i = currentRight - 1; i > left; i--){
            char temp = arr[i];
            boolean isVowel = isVowel(temp);
            if(isVowel) return i;
        }

        return - 1;
    }


    public boolean isVowel(char c){

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default :
                return false;
        }

    }
}
