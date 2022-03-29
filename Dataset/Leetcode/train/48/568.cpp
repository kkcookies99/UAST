 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int row = matrix.size(); 
        if(!row) return;
        int col = matrix[0].size();

        // 对角线交换
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }

        // 列交换
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                swap(matrix[i][j],matrix[i][col-1-j]);
            }
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


