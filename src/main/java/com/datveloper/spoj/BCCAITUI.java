package com.datveloper.spoj;

public class BCCAITUI {

    public static int solve(int m, int[] weights, int[] values) {
        int[][] f = new int[weights.length + 1][m + 1];
        for (int i = 1; i < weights.length; i++) {
            for (int j = 0; j < m; j++) {
                if (j < weights[i]) {
                    f[i][j] = f[i - 1][j];
                } else {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - weights[i]] + values[i]);
                }
            }
        }
        return f[weights.length][m];
    }
}
