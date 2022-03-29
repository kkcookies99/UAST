 public int XXX(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int res = Math.min(height[start], height[end]) * (end - start);

        while (end > start) {
            if (height[start] < height[end]) {
                start += 1;
                int newRes = Math.min(height[start], height[end]) * (end - start);
                res = Math.max(newRes, res);
            } else {
                end -= 1;
                int newRes = Math.min(height[start], height[end]) * (end - start);
                res = Math.max(newRes, res);
            }
        }
        return res;
    }

