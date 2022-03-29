class Solution {
    public int XXX(int m, int n) {
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)arr[i][0]=1;
        for(int i=0;i<m;i++)arr[0][i]=1;
        for(int i=1;i<m;i++)
        for(int ii=1;ii<n;ii++)
        arr[ii][i]=arr[ii-1][i]+arr[ii][i-1];
        return arr[n-1][m-1];
    }
}

