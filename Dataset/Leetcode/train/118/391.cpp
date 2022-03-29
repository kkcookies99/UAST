 class Solution {
public:
    int c(int i, int j)
    {
        if(i == 0 || j == 0 || i == j)
        {
            return 1;
        }
        else
        {
            int ret = 1;
            for(int k = 1; k <= i - j; k ++)
            {
                ret *= (j + k);
                ret /= k;
            }
            return ret;
        }
    }
    vector<vector<int>> XXX(int numRows) {

        vector<vector<int> > ret;
        for(int i = 0; i < numRows; i ++)
        {
            vector<int> v;
            for(int j = 0; j < i + 1; j ++)
            {
                int n = c(i, j);
                v.push_back(n);
            }
            ret.push_back(v);
        }
        return ret;
    }
};

