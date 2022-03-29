     public int XXX(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length - 1; i ++) {
            for (int j = i + 1; j < height.length; j ++) {
                int h = Math.min(height[i], height[j]);
                area = Math.max(area, h * (j - i));
            }
        }
        return area;
    }

