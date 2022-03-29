class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        const auto n = matrix.size();
        const auto z = n - 1;
        const auto m = n >> 1;

        // 圈旋转
        for(auto j = 0; j < m; ++j) {
            // 圈内旋转
            for(auto i = j; i < z - j; ++i){
                auto p = z - i;
                auto q = z - j;
                auto t = matrix[j][i];

                matrix[j][i] = matrix[p][j];
                matrix[p][j] = matrix[q][p];
                matrix[q][p] = matrix[i][q];
                matrix[i][q] = t;  
            }  
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


