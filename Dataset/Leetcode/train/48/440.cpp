 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int left = 0, right = matrix[0].size() - 1, up = 0, down = matrix.size() - 1;
        while(left <= right){
            for(int i=0; i < right - left; i++){
                int temp = matrix[up][left+i];
                matrix[up][left+i] = matrix[down - i][left];
                matrix[down - i][left] = matrix[down][right-i];
                matrix[down][right-i] = matrix[up+i][right];
                matrix[up+i][right] = temp;
            }
            left++;
            right--;
            up++;
            down--;
        }
    }
};

