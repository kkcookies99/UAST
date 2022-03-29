 class Solution {
public:
    int XXX(vector<int>& height) {
        int area = 0;
        int l = 0, r = height.size() - 1;
        while (l < r) {
            int h = min(height[l], height[r]);
            // cout << h << ' ';
            area = max(area, h * (r - l));
            // cout << area << ' ';
            if (height[l] <= height[r]) {
                while (height[l] <= h && l < r) l++;
            }else {
                while (height[r] <= h && l < r) r--;
            }
        }
        return area;
    }
};

