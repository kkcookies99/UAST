class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> ans;
        int t = 1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            t += digits[i];
            ans.push_back(t % 10);
            t /= 10;
        }
        if (t) ans.push_back(t);
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

