 class Solution {
public:
    bool XXX(string s) {
        vector<char> ans;
    
        for(int i=0;i<s.size();i++)
        {     
            if((s[i]>=48 && s[i]<=57) ) ans.push_back(s[i]);
            if(s[i]>=65 && s[i]<=90 ) ans.push_back(s[i]+32);
            if(s[i]>=97 && s[i]<=122) ans.push_back(s[i]);
        }
       
        int l=0,r=ans.size()-1;
        while(l<r)
        {
            if(ans[l] == ans[r])
            {
                l++;
                r--;
            }
            else return false;
        }

        return true;
    }
};

