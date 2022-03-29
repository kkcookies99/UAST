class Solution {
    public int XXX(int m, int n) {
       int[][] ints = new int[m][n];
        for(int i=0;i<m;i++){
            ints[i][0] = 1;
        }
        for(int i = 0;i<n;i++){
            ints[0][i] = 1;
        }
        for(int i = 1;i<n; i++){
            for(int j=1;j<m;j++){
               ints[j][i] = ints[j-1][i]+ints[j][i-1];
            }
        }
        return ints[m-1][n-1];
    }
}

