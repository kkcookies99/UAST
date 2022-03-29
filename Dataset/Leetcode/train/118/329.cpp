 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> result;
        for(int i = 0; i < numRows; i++)
        {
            vector<int> p;
            if(i == 0){
                p.push_back(1);
            }
            else if(i == 1){
                p.push_back(1);
                p.push_back(1);
            }
            else{
                p.push_back(1);
                for(int j = 0; j < i - 1; j++){
                    p.push_back(result[i - 1][j] + result[i - 1][j + 1]);
                }
                p.push_back(1);
            }
            result.push_back(p);
        }
        return result;
    }
};

