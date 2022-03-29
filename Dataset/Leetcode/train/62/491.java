class Solution {
    public int XXX(int m, int n) {
        if (m==1 || n==1){  // 极端情况，只有一行或一列，直接返回1
            return 1;
        }
        int[][] mm = new int[m][n];
        // 动态规划
        // 只能从第i行第j列的左方或者上方到达第i行第j列
        // 所以step[i][j] = step[i-1][j] + step[i][j-1]
        // 其中step[i][j]表示到达第i行第j列的所有可能情况

        // 先初始化第一行和第一列，其step值均为1
        for (int i = 0; i < mm.length ; i++){
            mm[i][0] = 1;
        }
        for (int i = 0; i < mm[0].length ; i++){
            mm[0][i] = 1;
        }
        for (int i = 1; i < mm.length; i++){
            for (int j = 1; j < mm[0].length ; j++){
                mm[i][j] = mm[i-1][j] + mm[i][j-1];
            }
        }
        
        return mm[m-1][n-1];
            
    }
}

