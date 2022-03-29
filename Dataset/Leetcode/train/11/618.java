 class Solution {
    public int XXX(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tmp = (j - i) * (Math.min(height[i], height[j]));
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }
}

