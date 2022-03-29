 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> results;

        results.push_back({1});

        for(int i=1;i<numRows;i++){
            vector<int> result;
            result.push_back(1);
            int previousLevelSize = results[i-1].size();
            for(int j=1;j<previousLevelSize;j++){
                result.push_back(results[i-1][j-1]+results[i-1][j]);
            }
            result.push_back(1);
            results.push_back(result);
        }

        return results;

    }
};
