    public int XXX(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                res = Math.max(res,Math.min(height[i],height[j]) * (j - i));
            }
        }
        return res;
    }

