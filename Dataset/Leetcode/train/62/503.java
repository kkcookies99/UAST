class Solution {
    public int XXX(int m, int n) {
        int[] result = new int[n];
        for(int i=0;i<result.length;i++) {
            result[i] = 1;
        }

        int i = m-2;
        while(i>=0) {
            int j = n-1;
            while(j>=0) {
                if(j==n-1) {
                    result[j] = 1;
                } else {
                    result[j] += result[j+1];
                }
                j--;
            }
            i--;
        }

        return result[0];
    }
}

//dp[i, j] = dp[i+1, j] + dp[i, j+1] from top, i, j start from 0
//dp[i, j] = dp[i-1, j] + dp[i, j-1] from bottom, i, j start from m-1, n-1
//cost space n, time m*n

