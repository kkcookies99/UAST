 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int up = 0;
        int left = 0;
        int down = n-1;
        int right = n-1;
        while(up <= down && left <= right){
            for(int i = left,j=0;i < right;++i){
                int mark = matrix[up][i];
                matrix[up][i] = matrix[down-j][left];
                matrix[down-j][left] = matrix[down][right-j];
                matrix[down][right-j] = matrix[up+j][right]; 
                matrix[up+j][right] = mark;
                j++;
            }
            up++;
            left++;
            down--;
            right--;
        }
    }
};

