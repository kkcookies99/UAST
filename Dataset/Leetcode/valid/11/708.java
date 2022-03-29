     public int XXX(int[] height) {
        int area = 0;
        int le = 0, ri = height.length - 1;
        
        while (le < ri) {
            int h = Math.min(height[le], height[ri]);
            area = Math.max(area, (ri - le) * h);
            if (height[le] < height[ri]) le ++;
            else                         ri --;
        }
        return area;
    }

