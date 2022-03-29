class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        if(n==0)
            return;
        //先按对角交换数字
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        //按中轴线交换
        for(int j=0;j<n/2;j++){//列
            for(int i=0;i<n;i++){//行
                swap(matrix[i][j],matrix[i][n-j-1]);
            }
        }
        return;
    }
};

