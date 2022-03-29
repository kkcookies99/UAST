 class Solution {
    public void XXX(int[][] matrix) {
        int n = 0;
        if(matrix == null || (n = matrix.length) == 0)      return ;

        int start = 0, end = n-1;
        while(start < end){
            for(int i=0, limit = end-start; i<limit; i++){
                int tmp = matrix[start+i][start];
                matrix[start+i][start] = matrix[end][start+i]; // 更新 start 列
                matrix[end][start+i] = matrix[end-i][end]; //  更新 end 行
                matrix[end-i][end] = matrix[start][end-i]; // 更新 end 列
                matrix[start][end-i] = tmp; // 更新 start 行
            }
            start++;
            end--;
        }
    }
}

