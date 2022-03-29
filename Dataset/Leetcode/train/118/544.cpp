 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> result(numRows);  //!!!!!!
        if(numRows == 0) return result;

        for(int i=0; i<numRows; i++){
            result[i].resize(i+1);  //!!!!!!
            result[i][0] = 1; result[i][i] = 1;
            int j = 1;
            while(j<i){
                result[i][j] = result[i-1][j-1] + result[i-1][j];
                j++;
            }
        }
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


