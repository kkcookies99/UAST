 class Solution {
    public int XXX(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int ans = 0;
        while (i < j) {
            ans = Math.max(ans, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}

