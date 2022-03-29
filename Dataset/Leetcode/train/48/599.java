 class Solution {
    public void XXX(int[][] matrix) {
        // [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]
        int len = matrix.length;
        // 一圈一圈来：从最外圈到最内圈。
        for(int i=0; i< (len+1)/2; i++){
            // 第i圈
            // 注：长度-1,防止覆盖
            int qlen = len-2*i-1;
            int[] temp = new int[qlen];
            for(int j=0; j<qlen; j++) {
                temp[j] = matrix[i][i+j];
            }
            // 4->1
            for(int j=0; j<qlen; j++) {
                matrix[i][i+j] = matrix[len-1-i-j][i];
            }
            // 3->4
            for(int j=0; j<qlen; j++) {
                matrix[len-1-i-j][i] = matrix[len-1-i][len-1-i-j];
            }
            // 2->3
            for(int j=0; j<qlen; j++) {
                matrix[len-1-i][len-1-i-j] = matrix[i+j][len-1-i];
            }
            // 1->2
            for(int j=0; j<qlen; j++) {
                matrix[i+j][len-1-i] = temp[j];
            }
        }
    }
}

