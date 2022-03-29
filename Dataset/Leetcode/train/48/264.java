public void XXX(int[][] matrix) {
        int n = matrix[0].length;
        int[][] target = new int[n][n];        
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = matrix[i][j];
            }
        }                
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = target[n-j-1][i];
            }
        }
    }

