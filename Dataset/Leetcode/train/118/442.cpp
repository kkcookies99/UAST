 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> triangle;
        if(numRows == 0){
            return triangle;
        }
        triangle.push_back({1});
        for(int i = 1; i < numRows; ++i){
            vector<int> row;
            row.push_back(1);
            for(int j = 1; j < i; ++j){
                row.push_back(triangle[i - 1][j - 1] + triangle[i - 1][j]);
            }
            row.push_back(1);
            triangle.push_back(row);
        }

        return triangle;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


