 class Solution {
public:
    //递归[先外层循环，再n-2旋转]
    void XXX_n(vector<vector<int>>& matrix,int start,int n){
        if(n-start<=1){
            return;
        }
        int tmp;
        //只对每层的外圈进行旋转
        for(int i=0;i<n-1-start;i++){
            tmp = matrix[i+start][n-1];
            matrix[i+start][n-1] = matrix[start][i+start];
            matrix[start][i+start] = matrix[n-1-i][start];
            matrix[n-1-i][start] = matrix[n-1][n-1-i];
            matrix[n-1][n-1-i] = tmp;
            
        }
        //旋转除了外圈剩下的n-2*n-2矩阵
        XXX_n(matrix,start+1,n-1);
    }
    void XXX(vector<vector<int>>& matrix) {
        XXX_n(matrix,0,matrix.size());
        //XXX_n(matrix,1,matrix.size()-1);
        
    }
};

