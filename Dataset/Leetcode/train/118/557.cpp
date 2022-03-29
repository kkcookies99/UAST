 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> a;
        for(int i = 0;i<numRows;i++)
        {
            vector<int> row;
            for(int j = 0;j<=i;j++)
            {
                if(j==0 || j == i)
                    row.push_back(1);
                else
                {
                    int num = a[i-1][j-1]+a[i-1][j];
                    row.push_back(num);
                }
            }
            a.push_back(row);
        }
        return a;
    }
};

