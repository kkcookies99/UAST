 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> rows;
        for(int i=0;i<numRows;i++)
        {
            vector<int> row;
            row.push_back(1);
            for(int j=0;j<i-1;j++)
            {
                int k=rows[i-1][j]+rows[i-1][j+1];
                row.push_back(k);
            }
            if(i!=0)
                row.push_back(1);
            rows.push_back(row);
        }
        return rows;
    }
};

