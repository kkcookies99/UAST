 class Solution {
    public void XXX(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<(n+1)/2;i++)
        {
            int len=n-2*i;
            for(int j=i;j<n-i-1;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[len-1+2*i-j][i];
                matrix[len-1+2*i-j][i]=matrix[len-1+i][len-1+2*i-j];
                matrix[len-1+i][len-1+2*i-j]=matrix[j][len-1+i];
                matrix[j][len-1+i]=temp;
            }
        }
    }
}

