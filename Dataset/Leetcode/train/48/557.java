 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<Math.ceil(n/2);i++){
            R(matrix,n,i);
        }
    }
    //每次旋转结束转动一圈，对第a行的[a,a] ~ [a,n-a-1]进行旋转，a每次变大后，旋转的长度缩短
    //n-a-1 这里的-1表示当前圈这一行的最后一个数字，必须剪掉，不然会导致重复旋转
    //旋转规则，
    //i*j -> j * (n-1-i)
    public void R(int[][] matrix,int n ,int a){
        //获得需要旋转的四个位置
        for(int i = a;i< matrix.length -a-1;i++){
            //获取到旋转后的下标
            int[] swapIndex1 = new int[]{a,i};
            int[] swapIndex2 = getRotateIndex(swapIndex1,n);
            int[] swapIndex3 = getRotateIndex(swapIndex2,n);
            int[] swapIndex4 = getRotateIndex(swapIndex3,n);
            int swap1 = matrix[a][i];
            matrix[a][i] = matrix[swapIndex4[0]][swapIndex4[1]];
            matrix[swapIndex4[0]][swapIndex4[1]] = matrix[swapIndex3[0]][swapIndex3[1]];
            matrix[swapIndex3[0]][swapIndex3[1]] = matrix[swapIndex2[0]][swapIndex2[1]];
            matrix[swapIndex2[0]][swapIndex2[1]] = swap1;
        }
    }
    //返回旋转后的位置
    public int[] getRotateIndex(int[] index,int n){
        int[] res = new int[2];
        res[0] = index[1];
        res[1] = (n-1-index[0]);
        return res;
    }
}

