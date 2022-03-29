 class Solution {
    public void XXX(int[][] matrix) {
        /**
            法一：
                寻找规律，遍历求解
                算法思想：
                    开辟一个相同的数组空间。
                    时间复杂度：O(N2)
                    空间复杂度：O(N2)
            
            法二：
                先沿主对角线翻转，然后左右列对应交换
                在遍历求解时，只遍历半部分(上半部分/下半部分))
        **/

        // method1
        // method1(matrix);

        // method2
        method2(matrix);
                
    }

    public void method1(int[][] matrix){
        int length = matrix.length;
        int[][] matrix_ = new int[length][length]; // 用于返回的数组
        for(int i = 0;i < length;++i){ // 从左向右遍历第i行的每个元素
            for(int j = 0;j < length;++j){ 
                matrix_[j][length - i - 1] = matrix[i][j];
            }
        }

        for(int i = 0;i < matrix.length;++i){
            for(int j = 0;j < matrix.length;++j){
                matrix[i][j] = matrix_[i][j];
            }
        }
    }

    public void method2(int[][] matrix){
        int length = matrix.length;
        int temp = matrix[0][0];

        for(int i = 0;i < length;++i){ // 主对角线翻转,上三角
            for(int j = i + 1;j < length;++j){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int j = 0;j < length / 2;++j){ // 左右列交换，从左半列开始
            for(int i = 0;i < length;++i){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - j -1];
                matrix[i][length - j -1] = temp;
            }
        }

    }
}

