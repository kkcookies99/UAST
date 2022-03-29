    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<matrix.length/2;i++){
            for(int j=i;j<matrix.length-1-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix[0].length-1-j];
                matrix[matrix.length-1-i][matrix[0].length-1-j] = matrix[j][matrix[0].length-1-i];
                matrix[j][matrix[0].length-1-i] = temp;
            }
        }
    }

