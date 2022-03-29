 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> ret = digits;
        for (int i = ret.size()-1; i >= 0; i--)
        {
            if (ret[i] == 9)
            {
                ret[i] = 0;
                if (i == 0)
                {
                    ret.insert(ret.begin(), 1);
                }
                continue;
            }
            else
            {
                ret[i]++;
                break;
            }
        }
        return ret;
    }
};

