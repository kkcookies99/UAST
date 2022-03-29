 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0, l = 0, r = height.size() - 1;
        while (l < r) res = max(res, (r - l) * height[height[l] <height[r] ? l++ : r--]);
        return res;
    }
};

