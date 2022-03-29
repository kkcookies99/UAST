 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        string str;
        
        str.resize(n * 2);
        XXX_(0, 0, n, str, ans);
        return ans;
    }

    void XXX_(int l, int r, int n, string &str, vector<string> &ans)
    {
        if(l == n && r == n)
        {
            ans.push_back(str);
            return;
        }
        
        //go left
        if(l < n)
        {
            str[l + r] = '(';
            l++;
            XXX_(l, r, n, str, ans);
            l--;
        }
        

        //go right
        if(r < l)
        {
            str[l + r] = ')';
            r++;
            XXX_(l, r, n, str, ans);
            r--;
        }
    }
};

