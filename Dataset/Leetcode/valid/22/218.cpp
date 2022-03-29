 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        string s;
        gen(ans,s,n);
        return ans;
    }
    bool valid(string s)
    {
        int count_l=0,count_r=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s[i])
            {
                case '(':count_l++;break;
                case ')':count_r++;break;
                default:break;//throw new IllegalArgumentException;
            }
            if(count_l<count_r)return false;
        }
        if(count_l==count_r)return true;
        else return false;
    }
    void gen(vector<string>& ans,string& s,int n)
    {
        if(s.length()==2*n)
        {
            if(valid(s))ans.push_back(s);
            return ;
        }
        s.push_back('(');
        gen(ans,s,n);
        s.pop_back();
        s.push_back(')');
        gen(ans,s,n);
        s.pop_back();
    }

};

