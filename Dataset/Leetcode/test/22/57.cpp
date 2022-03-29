 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        XXX(res, "", n, n);
        return res;
    }

    void XXX(vector<string> &res, string str, int l, int r) {
        if (l == 0 && r == 0) return res.push_back(str);
        if (l > 0) XXX(res, str+"(", l-1, r);
        if (r > 0 && r > l) XXX(res, str+")", l, r-1);
    }
};

