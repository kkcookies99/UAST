 class Solution {
public:
    void swapCircle(vector<vector<int>>& matrix , int i , int j){
        int n = matrix.size()-1;
        int tmp_a = matrix[i][j];
        int tmp_b = matrix[j][n-i];
        int tmp_c = matrix[n-i][n-j];
        matrix[i][j] = matrix[n-j][i];
        matrix[n-j][i] = tmp_c;
        matrix[n-i][n-j] = tmp_b;
        matrix[j][n-i] = tmp_a;
    }
    void XXX(vector<vector<int>>& matrix) {
    //环形交换数值
    int maxlength = matrix.size()-1;
    int depth = ceil((double)matrix.size() / 2.0);
    for(int i=0;i < maxlength;i++){
        for(int j=0;j<depth;j++){
            //一组交换
            swapCircle(matrix,i,j);
        }
        maxlength--;
    }
     //matrix[i][j] -> matrix[j][n-i] -> matrix[n-i][n-j] -> matrix[n-j][i] -> matrix[i][j];
    }
};

