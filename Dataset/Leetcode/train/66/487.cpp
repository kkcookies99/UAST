class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int len = digits.size();
         vector<int> ans;
        if(dfs(digits,0,len))
        {
            ans.push_back(1);
            for(auto c:digits) ans.push_back(c);
            return ans;
        }
        return digits;
    }
    bool dfs(vector<int> &digits, int n, int &len)
    {
        if(n==len-1||dfs( digits, n+1, len)) 
        {
            digits[n] += 1;
            if(digits[n] == 10) 
            {
                digits[n] = 0;
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
};

