class Solution {
public:
    int XXX(vector<int>& height) {
        int l = 0;
        int n = height.size();
        int r = n - 1;
        int ret = 0;
        while(l < r) {
            ret = max(ret, (r - l) * min(height[r], height[l]));
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return ret;
    }
};

