 class Solution {
    public void XXX(int[][] matrix) {
        int a=0;
        int b=matrix.length-1;
        while(a<b){
            for(int i=a;i<b;i++){
                int j=a+b-i;
                int t=matrix[a][i];
                matrix[a][i]=matrix[j][a];
                matrix[j][a]=matrix[b][j];
                matrix[b][j]=matrix[i][b];
                matrix[i][b]=t;
            }
        a++;
        b--;
        }
    }
}

