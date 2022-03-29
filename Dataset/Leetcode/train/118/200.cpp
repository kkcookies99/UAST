 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> YHtriangles;
        vector<int> row;

        for(int i = 0; i < numRows; i++){
            row.resize(i+1, 1);
            for(int j = 1; j < i; j++){
                row[j] = YHtriangles[i-1][j-1] + YHtriangles[i-1][j]; 
            }
            YHtriangles.push_back(row);
            row.clear();
    }

    return YHtriangles;
    }
};

