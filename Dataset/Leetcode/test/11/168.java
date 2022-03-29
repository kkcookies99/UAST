class Solution {
    public int XXX(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int minH = Math.min(height[l], height[r]);
            max = Math.max(max, (r -l) * minH);
            while(l < r && height[l] <= minH) l++;
            while(l < r && height[r] <= minH) r--;
        }
        return max;
    }
}

