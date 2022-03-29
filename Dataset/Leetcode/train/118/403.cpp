 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> arr;
        for(int i = 0; i < numRows; ++i){
            vector<int> row(i+1 , 0);
            for(int j = 0; j < i+1; ++j){
                if(j == 0 || j == i){
                    row[j] = 1;
                }else{
                    row[j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
            arr.push_back(row);
        }
        return arr;
    }
};

