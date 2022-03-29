class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        // 1. 创建相同维度的矩阵v
        vector<vector<int>> vMatrix = {matrix.size(), vector<int>()};
        // 2. 将最后一行复制到新矩阵v的第一列，倒数第二行放到第二列，以此重复
        //    直到第一行放到最后一列
        for(int row = matrix.size()-1; row >=0; row --){
            for(int num = 0; num < matrix[row].size(); num++){
                vMatrix[num].push_back(matrix[row][num]);
            }
        }
        // 3. 将旋转后的矩阵覆盖原矩阵
        matrix = vMatrix;
    }
};

