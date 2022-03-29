class Solution {
public:
    void swap(int &a,int &b){
        int temp = a;
        a = b;
        b = temp;
    }
    void XXX(vector<vector<int>>& matrix) {
        if (!matrix.size()) return;
        int row = matrix.size();
        int col = matrix[0].size();
        
        //主对角线:上下交换
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if(i != j)
                    swap(matrix[i][j], matrix[j][i]);
            }
        }
        //中线:左右交换
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col/2; j++) {
                if(j != (double)col/2 - 0.5)
                    swap(matrix[i][j], matrix[i][col - 1 - j]);
            }
        }
    }
};

