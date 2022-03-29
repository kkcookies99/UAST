class Solution {
    public int XXX(int n) {
        return pow(new int[][]{{1,1},{1,0}},n)[0][0];
    }
    public int[][] pow(int x[][],int n){
        int[][] res={{1,0},{0,1}};
        while(n>0){
            if((n&1)==1){
                res=mult(res,x);
            }
            n=n>>1;
            x=mult(x,x);
        }
        return res;
    }
    public int[][] mult(int[][] x,int[][] y){
        int[][] z=new int[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                z[i][j]=x[i][0]*y[0][j]+x[i][1]*y[1][j];
            }
        }
        return z;
    }
}

