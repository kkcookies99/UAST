public void XXX(int[][] matrix) {
        XXX1(matrix,0,matrix.length);
    }
    //进行递归的函数
    //size是每一次矩阵的长/宽
    public void XXX1(int[][] matrix,int start,int size){
        //递归出口
        if (size == 1 || size == 0) {
            return;
        }
        int slow = start,temp1,temp2;
        for(;slow < start+size-1;slow++){
            //先换第一个
            temp1 = matrix[slow][start+size-1];
            matrix[slow][start+size-1] = matrix[start][slow];
            //第二个
            temp2 = matrix[start+size-1][2*start+size-1-slow];
            matrix[start+size-1][2*start+size-1-slow] = temp1;
            //第三个
            temp1 = matrix[2*start+size-1-slow][start];
            matrix[2*start+size-1-slow][start] = temp2;
            //第四个
            matrix[start][slow] = temp1;
        }
        XXX1(matrix,start+1,size-2);
    }

