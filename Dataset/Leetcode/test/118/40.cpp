 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> vec;
        for(int i= 0;i < numRows;i++){
            vec.push_back(vector<int> (i+1,1));
            if(i > 1){
                for(int j = 1; j < i; j++){
                    vec[i][j] = vec[i-1][j-1] + vec[i-1][j];
                }
            }       
        }
        return vec;
    }
};

