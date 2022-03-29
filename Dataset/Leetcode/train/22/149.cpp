 class Solution {
public:
    void find(const int n, int left, int right, string tmp, vector<string>& ans)
    {
        if (right==n)
        {
            ans.push_back(tmp);
            return;
        }
        if (left<n)
            find(n,left+1,right,tmp+'(',ans);
        if (left>right)
            find(n,left,right+1,tmp+')',ans);
        return;
    }
    vector<string> XXX(int n) {
        vector<string> ans;
        string tmp;
        find(n,0,0,tmp,ans);
        return ans;
    }
};

