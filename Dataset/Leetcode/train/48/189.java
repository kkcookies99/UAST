class Solution {
    public void XXX(int[][] matrix) {
        Stack<int[]> listStack = new Stack<int[]>();
        for (int i=0;i<matrix.length;i++) {
            int[] ints = new int[matrix.length];
            for (int j =0;j<matrix.length;j++)
            {
                ints[j] = matrix[i][j];
            }
            listStack.push(ints);
        }
        //拿到的stack
        for (int i=0;i< matrix.length;i++)
        {
            int[] ints;
            ints = listStack.pop();
            for (int j=0;j< matrix.length;j++)
            {
                matrix[j][i] = ints[j];
            }
        }

    }
}

