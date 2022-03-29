class Solution {
    public int XXX(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            int area = min * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
                while (height[l] < min && l < r) {
                    ++l;
                }
            } else {
                --r;
                while (height[r] < min && l < r) {
                    --r;
                }
            }
        }
        return ans;
    }
}

