import java.util.*;

public class pro6 {
    
    /**
     * Finds the minimum path sum from top-left to bottom-right in a grid
     * You can only move right or down at any point in time
     * 
     * @param grid 2D array representing the grid with values
     * @return minimum path sum
     */
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Create a DP table to store minimum path sums
        int[][] dp = new int[rows][cols];
        
        // Initialize the starting point
        dp[0][0] = grid[0][0];
        
        // Fill first row (can only come from left)
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        
        // Fill first column (can only come from top)
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        // Fill the rest of the table
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                // Minimum of coming from top or left
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[rows-1][cols-1];
    }
    
    /**
     * Alternative space-optimized solution using only O(n) space
     */
    public static int minPathSumOptimized(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        int[] dp = new int[cols];
        dp[0] = grid[0][0];
        
        // Initialize first row
        for (int j = 1; j < cols; j++) {
            dp[j] = dp[j-1] + grid[0][j];
        }
        
        // Process remaining rows
        for (int i = 1; i < rows; i++) {
            dp[0] += grid[i][0]; // First column
            for (int j = 1; j < cols; j++) {
                dp[j] = Math.min(dp[j], dp[j-1]) + grid[i][j];
            }
        }
        
        return dp[cols-1];
    }
    
    /**
     * Prints the actual path taken
     */
    public static List<int[]> getPath(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new ArrayList<>();
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        
        // Fill DP table
        dp[0][0] = grid[0][0];
        for (int j = 1; j < cols; j++) dp[0][j] = dp[0][j-1] + grid[0][j];
        for (int i = 1; i < rows; i++) dp[i][0] = dp[i-1][0] + grid[i][0];
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        // Backtrack to find path
        List<int[]> path = new ArrayList<>();
        int i = rows - 1, j = cols - 1;
        path.add(new int[]{i, j});
        
        while (i > 0 || j > 0) {
            if (i == 0) {
                j--;
            } else if (j == 0) {
                i--;
            } else if (dp[i-1][j] < dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
            path.add(0, new int[]{i, j});
        }
        
        return path;
    }
    
    public static void main(String[] args) {
        // Test with the given grid
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Grid:");
        printGrid(grid);
        
        int minSum = minPathSum(grid);
        System.out.println("\nMinimum path sum: " + minSum);
        
        // Verify the expected result
        if (minSum == 21) {
            System.out.println("✓ Correct! Expected minimum path sum is 21");
        } else {
            System.out.println("✗ Expected 21, but got " + minSum);
        }
        
        // Show the actual path
        List<int[]> path = getPath(grid);
        System.out.println("\nPath taken:");
        for (int[] pos : path) {
            System.out.printf("(%d,%d) -> ", pos[0], pos[1]);
        }
        System.out.println("END");
        
        // Test with additional examples
        System.out.println("\n" + "=".repeat(50));
        
        int[][] grid2 = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        
        System.out.println("Grid 2:");
        printGrid(grid2);
        System.out.println("Minimum path sum: " + minPathSum(grid2));
        
        int[][] grid3 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        System.out.println("\nGrid 3:");
        printGrid(grid3);
        System.out.println("Minimum path sum: " + minPathSum(grid3));
    }
    
    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
    }
}
