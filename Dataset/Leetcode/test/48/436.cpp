 class Solution {
public:
    void XXX(vector<vector<int>>& m) {
        if(!m.size() || !m[0].size()) return;
        int rows=m.size(); int cols = m[0].size();
        for(int i = 0;i<rows;i ++)
        {
            for(int j=0;j<i;j++)
            {
                swap(m[i][j],m[j][i]);
            }
        }
        for(int i=0;i<rows;i++)
        {
            int l = 0; int r = m[i].size() - 1;
            while(l < r)
            {
                swap(m[i][l++],m[i][r--]);
            }
        }
    }
};

