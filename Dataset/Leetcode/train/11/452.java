 class Solution {
    public int XXX(int[] height) {
        int XXX = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = Math.min(height[i], height[j]);
            XXX = Math.max(XXX, (j - i) * minHeight);
            while (i < j && height[i] <= minHeight) {
                i++;
            }
            while (i < j && height[j] <= minHeight) {
                j--;
            }
        }
        return XXX;
    }
}

