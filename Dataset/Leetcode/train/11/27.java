class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int len = height.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                max = Math.max(max, Math.abs((i -j) * Math.min(height[i], height[j])));
            }
        }
        return max;
    }
}

