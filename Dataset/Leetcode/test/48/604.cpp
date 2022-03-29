 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        for(auto &v : matrix){
            reverse(v.begin(),v.end());
        }       
        int tmp = 0;
        int N = matrix.size();
        for(int i = 0 ; i < N ; i ++){
            for( int j = 0 ; j < N - i ; j++ ){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][N- 1 - i];
                matrix[N - 1 - j][N- 1 - i] = tmp;
                // cout<< "i  j"<< i<< " "<< j << " "<<matrix[i][j] <<endl;
            }
        }
    }
};

