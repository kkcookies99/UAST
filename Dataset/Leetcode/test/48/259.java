class Solution {
    public void XXX(int[][] matrix) {
        int l=matrix.length;
        if(l<=1) return;
        int row=0;
        while(row<l/2){
            int n=l-row*2-1;
            int i=0;
            int j=0;
            for(int k=0;k<n;k++){
                j=k;
                int pre=matrix[i+row][j+row];
                for(int m=0;m<4;m++){  
                    int pre_i=i;
                    i=j;
                    j=n-pre_i;
                    int tmp=matrix[i+row][j+row];
                    matrix[i+row][j+row]=pre;
                    pre=tmp;
                }
            }
            row++;
        }
    }
}

