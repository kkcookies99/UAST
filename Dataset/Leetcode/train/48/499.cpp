 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if(matrix.size()==0)return;
        for(int i=0;i<matrix.size();++i){
            for(int j=0;j<i;++j){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int i=0;i<matrix.size();++i){
            for(int j=0;j<matrix.size()/2;++j){
                swap(matrix[i][j],matrix[i][matrix.size()-1-j]);
            }
        }
    }
};

