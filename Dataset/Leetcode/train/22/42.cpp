 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        if (n==0)
        {
            res.push_back("");
            return res;
        }
        for(int i=0;i<n;i++)
        {
            vector<string> left=XXX(n-i-1);
            vector<string> right=XXX(i);
            for(string l:left)
                for(string r:right)
                {
                    res.push_back("("+l+")"+r);
                }
        }
        return res;
    }
};

