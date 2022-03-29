class Solution {
    public int XXX(int[] height) {
        int max = 0, minHeight = 0, area = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            minHeight = height[i] < height[j] ? height[i++] : height[j--];
            area = (j-i+1) * minHeight;
            max = Math.max(max,area);
        }
        return max;
    }
}

