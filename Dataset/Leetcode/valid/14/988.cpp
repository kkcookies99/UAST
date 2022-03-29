 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n = strs.size();
        if(!n)return "";
        if(n == 1)return strs[0];
        string ans = strs[0];
        for(int i = 0 ;i < n; i++)
        {
            for(int j= 0 ; j <ans.size();j++)
            {
                if(strs[i][j]!= ans[j])
                {
                    ans = ans.substr(0,j);
                    break;
                }
            }
        }
        return ans;
    }
};

