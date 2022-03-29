 class Solution {
public:
    int XXX(vector<int>& height) {
        int l = 0, r = height.size() - 1;
        int ret = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if ((r - l) * height[l] > ret) ret = (r - l) * height[l];
                l++;
            } else {
                if ((r - l) * height[r] > ret) ret = (r - l) * height[r];
                r--;
            }

        }
        return ret;
    }
};

