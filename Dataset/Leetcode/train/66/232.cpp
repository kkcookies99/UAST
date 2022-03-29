 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> res{};
        int jinwei = 0;
        digits.back()++;
        while(!digits.empty())
        {
            int tmp = digits.back();
            digits.pop_back();
            tmp += jinwei;
            jinwei = tmp / 10;
            tmp %= 10;
            res.push_back(tmp);
        }
        if (jinwei)
        {
            res.push_back(1);
        }
        reverse(res.begin(),res.end());
        return res;
    }
};

