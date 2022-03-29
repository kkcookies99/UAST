public int XXX(int[] height) {
        int XXX = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                XXX = Math.max(XXX, Math.min(height[i], height[j]) * Math.abs(j - i));
            }
        }
        return XXX;
    }

