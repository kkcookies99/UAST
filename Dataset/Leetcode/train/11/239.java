   public int XXX(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i <= j) {
            max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            if (height[i] < height[j]) i++;
            else j--;
        }

        return max;
    }

