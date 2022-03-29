class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int len = matrix[0].size();
        //第一步：转置
        for(int i = 0; i < len; i++){
            for(int j = 0; j < i; j++){
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        //第二步：上下对成翻转
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len / 2; j++){
                swap(matrix[i][j], matrix[i][len - j - 1]);
            }
        }
    }
};

