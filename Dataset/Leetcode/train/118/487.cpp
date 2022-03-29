 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        for (int i=0; i<numRows; i++) {
            vector<int> row;
            row.push_back(1);
            for (int j=1; j <= i; j++) {
                if (j == i) {
                    row.push_back(1);
                } else {
                    int sum = res[i-1][j-1] + res[i-1][j];
                    row.push_back(sum);
                }
            }
            res.push_back(row);
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


