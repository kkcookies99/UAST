class Solution {
    public int XXX(int m, int n) {
            int[][] a =new int[n][m];
            for(int i = n-1;i>=0;i--){
                for(int j =m-1;j>=0;j--){
                    if(i==n-1||j==m-1){
                        a[i][j] = 1;
                    }else{
                        a[i][j] = a[i+1][j] + a[i][j+1];
                    }
                }
            }
            return a[0][0];
    }
}

