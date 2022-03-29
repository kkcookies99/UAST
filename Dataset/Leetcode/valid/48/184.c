void XXX(int** matrix, int matrixSize, int* matrixColSize){
    //traverse from outside to inside
    for(int i = 0; i < matrixSize - 1; i++){
        for(int p = i; p < matrixSize - i - 1; p++){
            //printf("position:[%d,%d][%d,%d][%d,%d][%d,%d]\n",i, p, p, matrixSize - i - 1, matrixSize - i - 1, matrixSize - p - 1, matrixSize - p - 1, i);
            int temp = matrix[p][matrixSize - i - 1];
            //exchange 1
            matrix[p][matrixSize - i - 1] = matrix[i][p];
            //exchange 2
            matrix[i][p] = matrix[matrixSize - p - 1][i];
            //exchange 3
            matrix[matrixSize - p - 1][i] = matrix[matrixSize - i - 1][matrixSize - p - 1];
            //exchange 4
            matrix[matrixSize - i - 1][matrixSize - p - 1] = temp;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


