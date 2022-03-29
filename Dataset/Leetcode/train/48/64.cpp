class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        transpose(matrix);
        for (auto& row : matrix) {
            reverse(row);
        }
    }
    
    // 转置函数
    void transpose(vector<vector<int>>& matrix) {
        int size = matrix.size();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < i; ++j) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
    
    // 反转操作
    void reverse(vector<int>& arr) {
        int i = 0;
        int j = arr.size() - 1;
        while(i <= j) {
            swap(arr[i++], arr[j--]);
        }
    }
};

