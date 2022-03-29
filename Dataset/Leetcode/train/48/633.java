 class Solution {
    public void XXX(int[][] matrix) {
        int number = matrix.length - 1;
        int first = 0;
        int last = 0;
        int round = 0;//第几层
        while (number > 0){
            for(int i = round ; i < (matrix[0].length -1-round);i++){//左闭右开
                int temp =  matrix[round][i];
                matrix[round][i] = matrix[matrix.length-1-i][round];
                matrix[matrix.length-1-i][round] =  matrix[matrix.length-1-round][matrix[0].length -1-i];
                matrix[matrix.length-1-round][matrix[0].length -1-i] =  matrix[i][matrix[0].length - round -1];
                matrix[i][matrix[0].length - round -1] = temp;
            }
            round++;
            number--;
        }
    }
}

