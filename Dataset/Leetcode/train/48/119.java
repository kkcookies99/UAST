public void XXX(int[][] matrix) {

   Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                   stack.push(matrix[i][j]);
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            int n = 1;
            while (n <= matrix.length) {
                matrix[matrix.length - n][i] = stack.pop();
                n++;
            }
        }
    }

