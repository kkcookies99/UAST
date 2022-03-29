 class Solution {
    public void XXX(int[][] matrix) {
        int N = matrix.length;
        int epoch = (int) N / 2;
        
        for (int i = 0; i < epoch; i++) {
            int tmp_len = 4 * (N - 2 * i) - 4;
            int index = 0;
            int indexi = 0;
            int[] tmp = new int[tmp_len];
            //上行，遍历列
            for (int j = i; j < N - i; j++) {
                tmp[index] = matrix[i][j];
                index++;
            }
            //开始转换
            matrix[i][N - i - 1] = tmp[indexi];
            indexi++;
            //右列，遍历行
            for (int j = i + 1; j < N - i; j++) {
                tmp[index] = matrix[j][N - i - 1];
                matrix[j][N - i - 1] = tmp[indexi];
                index++;
                indexi++;
            }
            //下行，遍历列
            for (int j = N  - i -2 ; j > i-1; j--) {
                tmp[index] = matrix[N - 1 - i][j];
                matrix[N - 1 - i][j] = tmp[indexi];
                index++;
                indexi++;
            }
            //左列，遍历行
            for (int j = N - i - 2; j > i; j--) {
                tmp[index] = matrix[j][i];
                matrix[j][i] = tmp[indexi];
                index++;
                indexi++;
            }
            //补最后一个
            matrix[i][i] = tmp[indexi];
            indexi++;
            //转换最顶行,遍历列
            for (int j = i + 1; j < N - i - 1; j++) {
                matrix[i][j] = tmp[indexi];
                indexi++;
            }
        }
        
    }
}

