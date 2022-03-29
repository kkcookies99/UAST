class Solution {
    public void XXX(int[][] matrix) {
        int n=matrix.length;    //从外圈到内圈依次收缩
        if(n == 1)  return;
        int index=0;            //表示每次的起始位置
        int range=n/2;
        int l=n;                //l表示每圈的方阵大小，如n × n的下一圈为(n-2)x(n-2)、(n-4)x(n-4)
        while(index < range){   //表示收缩的次数
            for(int i=0,j=index;i<l-1;i++,j++){     //每一圈需交换的数的个数，即每次l-1个
                int tep=matrix[index][j];       //每一圈的数依次交换到顺时针对应的位置
                matrix[index][j]=matrix[n-1-j][index];
                matrix[n-1-j][index]=matrix[n-1-index][n-1-j];
                matrix[n-1-index][n-1-j]=matrix[j][n-1-index];
                matrix[j][n-1-index]=tep;
            }
            index++;
            l-=2;       //收缩后方阵大小-2
        }
    }
}```

