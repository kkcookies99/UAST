 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res(numRows,vector<int>());
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    res[i].push_back(1);
                }else{
                    int gate = res[i - 1][j - 1] + res[i - 1][j];
                    res[i].push_back(gate);
                }
            }
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


