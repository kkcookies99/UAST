void XXX(int** matrix, int matrixSize, int* matrixColSize){
    int time=matrixSize/2;
    int startpoint=0;
    int margin=matrixSize;
    for(int t=0;t<time;t++)
    {
        for(int k=0;k<margin-1;k++)
        {
            int temp=matrix[startpoint][startpoint];
            for(int i=startpoint+1;i<matrixSize-t;i++) 
                    matrix[i-1][startpoint]=matrix[i][startpoint];
            for(int i=startpoint+1;i<matrixSize-t;i++)
                    matrix[matrixSize-t-1][i-1]=matrix[matrixSize-t-1][i];
            for(int i=matrixSize-t-2;i>=startpoint;i--)
                    matrix[i+1][matrixSize-t-1]=matrix[i][matrixSize-t-1];
            for(int i=matrixSize-t-2;i>startpoint;i--)
                    matrix[startpoint][i+1]=matrix[startpoint][i];

            matrix[startpoint][startpoint+1]=temp;
        }
        margin=margin-2;
        startpoint++;
    }
    return NULL;
}

