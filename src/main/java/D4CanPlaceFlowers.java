public class D4CanPlaceFlowers {
    /**
     * Code         605
     * Difficulty   easy
     * Question     You have a long flowerbed in which some of the plots are planted, and some are not.
     *              However, flowers cannot be planted in adjacent plots.
     *              Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
     *              and an integer n, return true if n new flowers can be planted in the flowerbed without violating
     *              the no-adjacent-flowers rule and false otherwise.
     *
     * link = "https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75"
     * todo         Drop copy and paste the content of method/function into the solution section on leetcode
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        //for length of exactly 1;
        if(len == 1 &&  flowerbed[0]==0){
            return n <= 1;
        }
        if(len == 1 &&  flowerbed[0]==1){
            return n <= 0;
        }


        for(int i = 0; i < len; i++){
            if(n == 0){
                return true;
            }
            if(flowerbed[i] == 1){
                ++i;
                continue;
            }
            boolean prev = false;
            boolean next = false;

            //handle first
            if(i == 0 && i <= len-1){
                next = flowerbed[i+1] == 0;

                if(next){
                    n--;
                    i++;
                }
                continue;
            }

            //handle last
            if(i == len-1){
                prev = flowerbed[i-1] == 0;
                if(prev){
                    n--;
                    i++;
                }
                continue;
            }
            //handle other
            prev = flowerbed[i-1] == 0;
            next = flowerbed[i+1] == 0;
            if(prev && next){
                n--;
                i++;
                continue;
            }

        }
        return n <= 0;
    }
}