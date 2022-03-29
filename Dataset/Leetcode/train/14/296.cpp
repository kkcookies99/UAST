 class Solution {
public:
    string XXX(vector<string>& strs) {
        int m = strs.size();
        if(0 == m) return "";
        int n_long_pre_max(strs[0].size());
        string s_common(strs[0]);
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n_long_pre_max;j++)
            {
                if(s_common[j] != strs[i][j]) 
                {
                    s_common = strs[i].substr(0,j);//始终感觉这儿得减一，但是测试显示不用减
                    n_long_pre_max = j;             //同上
                    break;
                }  
            }
            if(n_long_pre_max == 0)break;
        }
        return s_common;
    }
};

