package backtracking;

public class gridways {
    public static int grid(int i, int j, int m, int n, int[][] memo) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        } else if (i == m || j == n) {
            return 0;
        } else if (memo[i][j] != 0) {
            return memo[i][j];
        }
        // ways
        int w1 = grid(i + 1, j, m, n, memo);
        int w2 = grid(i, j + 1, m, n, memo);
        memo[i][j] = w1 + w2;
        return memo[i][j];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] memo = new int[m][n];
        System.out.println(grid(0, 0, m, n, memo));
    }
}
