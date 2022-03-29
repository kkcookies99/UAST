class Solution {
public:

    void rot(vector<vector<int>> &matrix, int x1, int y1, int x2, int y2){
        int length = x2 - x1;
        int temp = 0;
        for(int i=0; i<length; i++){
            temp = matrix[x1][y1+i];
            matrix[x1][y1+i] = matrix[x2-i][y1];
            matrix[x2-i][y1] = matrix[x2][y2-i];
            matrix[x2][y2-i] = matrix[x1+i][y2];
            matrix[x1+i][y2] = temp;
        }
    }


    void XXX(vector<vector<int>>& matrix) {
        int x1 = 0;
        int y1 = 0;
        int x2 = matrix.size()-1;
        int y2 = matrix.size()-1;
        while(x1 < x2){
            rot(matrix, x1++, y1++, x2--, y2--);
        }
    }
};

