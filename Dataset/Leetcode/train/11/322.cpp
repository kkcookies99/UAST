class Solution {
public:
    int XXX(vector<int>& height) {
        // 关键想明白为什么双指针是此题的解决思路
        // 原因在于短板原理，高度矮的挡板才是改变的关键
        int res = 0;
        int l = 0;
        int r = height.size() - 1;
        while (l < r) {
            int area = (r - l) * min(height[l], height[r]);
            res = max(area, res);
            if (height[r] < height[l]) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
};

