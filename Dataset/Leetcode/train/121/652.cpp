 class Solution {
public:
    int XXX(vector<int>& p) {
        int res = 0;
        if(!p.size()) return res;
        int m = INT_MAX;
        for(int i=0;i<p.size();i++)
        {
            res = max(res,p[i] - m);
            m = min(m,p[i]);
        }
        return res;
    }
};

