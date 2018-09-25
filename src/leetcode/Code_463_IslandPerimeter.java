package leetcode;

public class Code_463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) continue;
                int add = 0;
                if (i - 1 < 0 || grid[i - 1][j] == 0)
                    add++;
                if (i + 1 > row || grid[i + 1][j] == 0)
                    add++;
                if (j - 1 < 0 || grid[i][j - 1] == 0)
                    add++;
                if (j + 1 > col || grid[i][j + 1] == 0)
                    add++;
                sum += add;
            }
        }
        return sum;
    }
}
