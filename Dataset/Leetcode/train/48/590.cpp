 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if(matrix.size()==0) return;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<i;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size()/2;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.size()-j-1];
                matrix[i][matrix.size()-j-1]=tmp;
            }
        }
    }
};

