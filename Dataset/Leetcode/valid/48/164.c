void XXX(int** matrix, int matrixSize, int* matrixColSize){
    int diff[4][2] = {{0, 1}, {1, 0}, {0, -1},{-1, 0}};
    for (int i = 0; i < matrixSize/2; i++){//轮询从外到里的圈
        int q = (matrixSize - 2*i - 1);
        int count = q*4;
        for (int k = 0; k < q; k++){//一格格向右旋转
            int x = 0, y = 0, t = matrix[i][i];
            for (int j = 0; j < count; j++){//每个格向右旋转一次
                x += diff[j/q][0];
                y += diff[j/q][1];
                int c = matrix[x+i][y+i];
                matrix[x+i][y+i] = t;
                t = c;
            }
        }
    }
}

