 class Solution {
public:
    int XXX(vector<int>& height) {
        int len = height.size();
        int left = 0, right = len - 1;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                ans = max(ans, height[left] * (right - left));
                left++;
            } else {
                ans = max(ans, height[right] * (right - left));
                right--;
            }
        }
        return ans;
    }
};

