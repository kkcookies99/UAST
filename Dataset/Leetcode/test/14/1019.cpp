 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0)
        return "";

        string ans;
        ans = strs[0];
        for(auto str:strs)
        {
            for(int i = 0; i< ans.size();i++)
            {
                if(ans[i]==  str[i])
                continue;
                else
                ans = ans.substr(0,i);
            }

        }
        return ans;

    }
};

