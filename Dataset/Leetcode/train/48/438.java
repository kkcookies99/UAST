 class Solution {
    public void XXX(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        while(left < right && up < down){
            int[] temp = new int[right - left + 1];
            for(int i = left; i <= right; i++){
                temp[i - left] = matrix[up][i];
            }
            for(int i = up; i <= down; i++){
                matrix[up][right - i + left] = matrix[i][left];
            }
            for(int i = left; i <= right; i++){
                matrix[i][left] = matrix[down][i];
            }
            for(int i = down; i >= up; i--){
                matrix[down][right - i + left] = matrix[i][right];
            }
            for(int i = 0; i < temp.length; i++){
                matrix[i + up][right] = temp[i];
            }
            left++;
            right--;
            up++;
            down--;
        }
    }
}

