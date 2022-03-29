 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> tmp, ret;
        if(n <1) return tmp;
        ret.push_back("()");
        for(int i = 1; i < n; i++)
        {
            string tmpstr;
            for(int j = 0; j < ret.size(); j++)
            {               
                for(int k = 0; k < ret[j].size(); k++)
                {
                    tmpstr = ret[j];
                    tmp.push_back(tmpstr.insert(k,"()"));
                }
            }
            set<string> ss(tmp.begin(), tmp.end());
            ret.assign(ss.begin(), ss.end());
            tmp.clear();

        }
        return ret;

    }
};

