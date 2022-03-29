class Solution {
    public int XXX(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++) {
            int h = height[i];
            if (h == 0) {
                continue;
            }
            // 左边
            int end = i - (max / h);
            for(int l = 0; l < end; l++) {
                if(height[l] >= h) {
                    max = (i-l) * h;
                    break;
                }
            }
            // 右边
            int start = i + (max / h);
            for(int r = height.length-1; r > start; r--) {
                if (height[r] >= h) {
                    max = (r-i) * h;
                    break;
                }
            }
        }
        return max;
    }
}

