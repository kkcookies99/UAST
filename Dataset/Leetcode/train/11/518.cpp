 class Solution {
public:
    int XXX(const vector<int>& height) {
        int sz = height.size(), l = 0, r = sz - 1;
        int cur_area, max_area = 0;
        while (--sz) {
            if (height[l] < height[r]) {
                cur_area = sz * height[l];
            } else {
                cur_area = sz * height[r];
            }
            if (cur_area > max_area) {
                max_area = cur_area;
            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max_area;
    }
};

