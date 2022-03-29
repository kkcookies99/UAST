 class Solution {
public:
    vector<string> XXX(int n)
    {
        vector<string> res;
        gen(n, n, "", res);
        return res;
    }

    void gen(int left, int right, string s, vector<string>& res)
    {
        if (left == 0 && right == 0) {
            res.emplace_back(s);
            return;
        }

        if (left > 0)
            gen(left - 1, right, s + '(', res);

        if (right > left)
            gen(left, right - 1, s + ')', res);
    }
};

