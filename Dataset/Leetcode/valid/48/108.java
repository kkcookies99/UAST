class Solution {
    public void XXX(int[][] matrix) {
        /**
        顺时针旋转90度, 先按行翻转, 然后交换对角元素:
        
        * 1 2 3     7 8 9     7 4 1
        * 4 5 6  => 4 5 6  => 8 5 2
        * 7 8 9     1 2 3     9 6 3
        
        逆时针旋转90度, 先按列翻转, 然后交换对角元素:
        
        * 1 2 3     3 2 1     3 6 9
        * 4 5 6  => 6 5 4  => 2 5 8
        * 7 8 9     9 8 7     1 4 7
        **/
        
        int n = matrix.length;
        if(n < 1) return;
        for(int i = 0; i < n/2; ++i) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = temp;
        }
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

