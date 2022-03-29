 class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            max = Math.max(max, Math.abs((i - j) * Math.min(height[i], height[j])));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}

