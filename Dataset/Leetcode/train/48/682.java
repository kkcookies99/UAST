 class Solution {
    public void XXX(int[][] matrix) {
        boolean[][]key=new boolean[matrix.length][matrix.length];
        for(int i=0;i<=matrix.length/2;i++)
        for(int j=0;j<=matrix.length/2;j++)
        if(key[i][j]==false){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[matrix.length-1-j][i];
            matrix[matrix.length-1-j][i]
            =matrix[matrix.length-1-i][matrix.length-1-j];
            matrix[matrix.length-1-i][matrix.length-1-j]=
            matrix[j][matrix.length-1-i];
            matrix[j][matrix.length-1-i]=temp;
            key[i][j]=true;
            key[matrix.length-1-j][i]=true;
            key[matrix.length-1-i][matrix.length-1-j]=true;
            key[j][matrix.length-1-i]=true;
        }
    }
}
```0 ms	38.4 MB
这英文看的我恶心起来了

