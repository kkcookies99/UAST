class Solution {
    public void XXX(int[][] matrix) {
        int length=matrix.length;
        for(int n=length,c=0;n>1;n-=2,c++){
            int []tmp=new int[n];
            //store top edge
            for(int i=0;i<n;i++) tmp[i]=matrix[c][c+i];

            //fill top edge
            for(int i=0;i<n;i++) matrix[c][length-1-c-i]=matrix[c+i][c];
            //fill left edge
            for(int i=0;i<n;i++) matrix[c+i][c]=matrix[length-1-c][c+i];
            //fill bottom edge
            for(int i=0;i<n;i++) matrix[length-1-c][c+i]=matrix[length-1-c-i][length-1-c];
            //fill right edge
            for(int i=0;i<n;i++) matrix[length-1-c-i][length-1-c]=tmp[n-1-i];
        }
    }
}

