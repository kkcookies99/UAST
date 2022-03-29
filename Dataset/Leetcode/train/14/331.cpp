 class Solution {
public:
    string XXX(vector<string>& strs) {
        string res;
        for(int i=0;i<strs[0].size();i++)
        {
            int j;
            for(j=1;j<strs.size();j++)
            {
                if(strs[j][i] != strs[0][i])
                {
                    break;
                }
            }
            if(j==strs.size())
            {
                res = res + strs[0][i];
            }
            else break;
        }
        return res;
    }
};

