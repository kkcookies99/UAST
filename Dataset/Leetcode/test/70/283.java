class Solution {
    public int XXX(int n) {
        if(n<=1) return 1;
        int[][] d=new int[][]{{1,1},{1,0}};
        int[][] t=new int[][]{{1,1}};
        while(n!=0){
            if((n&1)==1)
                t=ttt(d,t);
            n>>=1;
            d=ttt(d,d);
        }
        return t[0][0];
    }
    int[][] ttt(int[][] a,int[][] b){
        int[][] t=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                int h=0;
                for(int k=0;k<b.length;k++)
                    h+=a[i][k]*b[k][j];
                t[i][j]=h;
            }
        }
        return t;
    }
}

