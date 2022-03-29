 class Solution {
    public int XXX(int m, int n) {

        if (m == 0 && n == 0){
            return 0;
        } else if (m == 1 || n == 1){
            return 1;
        }

        int[][] nums = new int[m][n];
        nums[0][0] = 1;
        nums[0][1] = 1;
        nums[1][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int tmpi = 0;
                int tmpj = 0;
                if (i - 1 == 0){
                    tmpj = 1;
                } else {
                    tmpj = nums[i - 1][j];
                }
                if (j - 1 == 0){
                    tmpi = 1;
                } else {
                    tmpi = nums[i][j - 1];
                }
                nums[i][j] = tmpi + tmpj;
            }
        }
        return nums[m -1][n - 1];
    }
}

