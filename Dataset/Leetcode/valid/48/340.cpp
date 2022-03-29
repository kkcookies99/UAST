class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = rows;
        if(rows == 1) return;

        int convert_row1, convert_row2, convert_row3, convert_row4;
        int convert_col1, convert_col2, convert_col3, convert_col4;
        int temp1, temp2, temp3, temp4;
        for(int row = 0; row < rows / 2; row++) {
            int new_cols = cols - row - 1;
            for(int col = row; col < new_cols; col++) {
                // 每次转换4次
                convert_row1 = row, convert_col1 = col;
                convert_row2 = convert_col1, convert_col2 = cols - convert_row1 - 1;
                convert_row3 = convert_col2, convert_col3 = cols - convert_row2 - 1;
                convert_row4 = convert_col3, convert_col4 = cols - convert_row3 - 1;
                temp1 = matrix[convert_row1][convert_col1];
                temp2 = matrix[convert_row2][convert_col2];
                temp3 = matrix[convert_row3][convert_col3];
                temp4 = matrix[convert_row4][convert_col4];
                matrix[convert_row1][convert_col1] = temp4;
                matrix[convert_row2][convert_col2] = temp1;
                matrix[convert_row3][convert_col3] = temp2;
                matrix[convert_row4][convert_col4] = temp3;
            }
        }
    }
};

