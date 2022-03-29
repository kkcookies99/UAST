 class Solution {
public:
    string XXX(vector<string>& strs) {
        int l = 3000;
        for(int i=0;i<strs.size();i++)
        {
            l = strs[i].length()<l?strs[i].length():l;
        }
        string s;
        int a=1;
        for(int i=0;i<l;i++)
        {
            s.push_back(strs[0][i]);
            for(int j=1;j<strs.size();j++)
            {
                if(strs[j][i] != strs[0][i])
                {
                    s.pop_back();
                    return s;
                }
            }
        }
        return s;
    }
};```

