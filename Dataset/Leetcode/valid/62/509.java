class Solution {
    public int XXX(int m, int n) {
int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i==0||j==0){
                    a[i][j] = 1;
                }else {
                    a[i][j] = a[i-1][j]+a[i][j-1];
                }

            }
        }
        return a[m-1][n-1];
    }
}

