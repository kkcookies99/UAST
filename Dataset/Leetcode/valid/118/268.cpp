 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> result(1, vector<int>(1, 1));
        if(numRows == 1)
            return result;
        
        for(int Row = 1; Row < numRows; Row++){
            vector<int> ans;
            for(int index = 0; index <= Row; index++){
                int R = index - 1, L = index;
                int value = 0;
                if(R >= 0)
                    value += result[Row - 1][R];

                if(L < result[Row - 1].size())
                    value += result[Row - 1][L];
                
                ans.push_back(value);
            }
            result.emplace_back(ans);
        }

        return result;
    }
};

