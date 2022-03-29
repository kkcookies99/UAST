class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        _XXX(matrix,0);
    }
    void _XXX(vector<vector<int>>& matrix,int num){
        if(num == matrix.size()/2) return;
        int buffer = 0;
        for(int i = 0; i < matrix.size()-2*num-1; i++){
            //四个节点需要旋转
            // matrix[num][num+i];
            // matrix[num+i][matrix.size()-1-num];
            // matrix[matrix.size()-1-num][matrix.size()-1-num-i];
            // matrix[matrix.size()-1-num-i][num];
            buffer = matrix[num][num+i];
            matrix[num][num+i] = matrix[matrix.size()-1-num-i][num];
            matrix[matrix.size()-1-num-i][num] = matrix[matrix.size()-1-num][matrix.size()-1-num-i];
            matrix[matrix.size()-1-num][matrix.size()-1-num-i] = matrix[num+i][matrix.size()-1-num];
            matrix[num+i][matrix.size()-1-num] = buffer;
        }
        _XXX(matrix,num+1);
    }
};

