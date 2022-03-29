class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int c = 1;
        vector<int> res;
        for (int i = digits.size() - 1; ~i; --i) {
            res.push_back((digits[i] + c) % 10);
            c = (digits[i] + c) / 10;
        }
        if (c) res.push_back(c);
        reverse(res.begin(), res.end());
        return res;
    }
};```

