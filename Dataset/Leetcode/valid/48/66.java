class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int iter = n/2;
        for(int i=0;i<iter;i++){
            for(int j=i;j<n-1-i;j++){//从外侧到内侧循环
                int temp = matrix[i][j]; //从主对角线元素开始保存一个临时值
                matrix[i][j]=matrix[n-1-j][i];//左侧赋给上侧
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];//下侧赋给左侧
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];//右侧赋给下侧
                matrix[j][n-1-i]=temp; //上侧temp赋给右侧
            }
        }
    }
}

