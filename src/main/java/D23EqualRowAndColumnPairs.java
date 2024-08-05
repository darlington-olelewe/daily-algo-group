import java.util.ArrayList;
import java.util.List;

public class D23EqualRowAndColumnPairs {
    /**
     * Code         2352
     * Difficulty   medium
     * Question     Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that
     *              row ri and column cj are equal.
     *              A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
     *
     * link = "https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75"
     */

    public int equalPairs(int[][] grid) {
        int len = grid.length;

        List<String> rows = new ArrayList<>();
        List<String> cols = new ArrayList<>();


        for(int i = 0; i < len; i++){
            StringBuilder sbRow = new StringBuilder();
            StringBuilder sbCol = new StringBuilder();
            for(int j = 0; j < len; j++){
                sbRow.append(grid[i][j]).append("."); //row
                sbCol.append(grid[j][i]).append("."); //col
            }

            rows.add(sbRow.toString());
            cols.add(sbCol.toString());
        }

        int count = 0;
        for(int i = 0; i < len; i++){
            String curr = rows.get(i);

            for(int j = 0; j < len; j++){
                String temp = cols.get(j);
                if(curr.equals(temp)){
                    count++;
                }
            }
        }
        return count;
    }
}
