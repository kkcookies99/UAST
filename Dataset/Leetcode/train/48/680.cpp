 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if(matrix.empty()) return;
        helper(matrix, matrix.size());
    }

    void helper(vector<vector<int>>& matrix, int n){
        if(n < 2) return;

        int len = matrix.size();
        int offset = (len - n) / 2;
        for(int i = 0; i < n - 1; i++){
            int x = 0, y = i;
            int nx = x, ny = y;
            do{
                int tmpY = ny;
                ny = (n - 1) - nx;
                nx = tmpY;
                swap(matrix[x + offset][y + offset], matrix[nx + offset][ny + offset]);
            }while(nx != x || ny != y);
        }
        helper(matrix, n - 2);
    }
};

