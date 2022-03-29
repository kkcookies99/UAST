public int XXX(int[] height) {
        int low = 0, high = height.length - 1;
        int area = 0, h = 0;
        while (low < high) {
            h = Math.min(height[low], height[high]);
            area = Math.max(area, h * (high - low));
            if (height[low] > height[high])
                high--;
            else
                low++;
        }
        return area;
    }

