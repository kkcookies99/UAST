 class Solution {
public:
    bool XXX(string s) {
        string res ="";
        if(!s.length()) return true;
        for(auto c:s)
        {
            int val = (int)c;
            if(val >= 48 && val <= 57) res+=c;
            else if(val >= 65 && val <= 90) 
            {
                res += (char)(val + 32);
            }
            else if(val >= 97 && val <= 122) res +=c;
        }
        cout<<res<<endl;
        if(!res.length())return true;
        int l = 0; int r =res.length() -1;
        if(res[l] != res[r]) return false;
        while(l <= r)
        {
            if(res[l] != res[r]) return false;
            l++,r--;
        }
        return true;
    }
};

