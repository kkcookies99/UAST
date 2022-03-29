 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        const int size=matrix.size();
        const int len=size-1;
        for(int i=0;i<size/2;++i){
            for(int j=0;j<size;++j){
                swap(matrix[i][j],matrix[len-i][j]);
            }
        }
        for(int i=0;i<size;++i){
            for(int j=i;j<size;++j){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
    }
};

