public int XXX(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            if(area > max)
                max = area;
            if(height[i] <= height[j])
                ++i;
            else if(height[j] < height[i])
                --j;
            else
                break;
        }
        return max;
        
    }

