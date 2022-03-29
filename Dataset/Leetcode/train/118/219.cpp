 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> rst;
        for(int i = 0; i < numRows; i++)
        {
            vector<int> buf;
            if(i == 0) buf.push_back(1);
            else
            {
                int pre = i - 1;
                for(int j = 0; j <= i; j++)
                {
                    if(j == 0 || j == i) buf.push_back(1);
                    else buf.push_back(rst[pre][j - 1] + rst[pre][j]);
                }
            }
            rst.push_back(buf);
        }
        return rst;
    }
};

