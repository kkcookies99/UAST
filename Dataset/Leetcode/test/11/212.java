    public int XXX(int[] height) {
        int XXX = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            XXX = Math.max(XXX, ((j - i) * Math.min(height[i], height[j])));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return XXX;
    }

