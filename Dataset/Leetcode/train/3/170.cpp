 class Solution {
public:
    int XXX(string s) {
        int hash[256] = {0}, n = s.length(), ans = 0, left = 0;

        for(int i = 0; i < n; i ++)
        {
            if(hash[s[i]] == 0 || hash[s[i]] < left)
            {
                ans = max(ans, i - left + 1);
            }
            else
                left = hash[s[i]];
            
            hash[s[i]] = i + 1;
        }
        return ans;
    }
};

