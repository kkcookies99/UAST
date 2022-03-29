    public void XXX(int[][] matrix) {
        XXXHelper(matrix,matrix.length,0,matrix.length);
    }

    private void XXXHelper(int[][] matrix,int n,int start,int end){
        if(start*2>=n){
            return;
        }
        for(int i=start;i<end-1;i++){
            //3次交换
            swap(matrix,start,i,start+i-start,end-1);
            swap(matrix,start,i,end-1,end-1-(i-start));
            swap(matrix,start,i,end-1-(i-start),start);
        }
        XXXHelper(matrix,n,start+1,n-start-1);
    }

    private void swap(int[][] matrix,int x,int y,int i,int j){
        int temp=matrix[x][y];
        matrix[x][y]=matrix[i][j];
        matrix[i][j]=temp;
    }

