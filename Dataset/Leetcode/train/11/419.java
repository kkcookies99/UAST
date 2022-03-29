     public int XXX(int[] height) {
        int left = 0;
        int right = height.length-1;
        int width = right-left;
        int ans = width * Math.min(height[left],height[right]);
        while (left < right) {
            width--;
            if(height[left] <= height[right]) left++;
            else right--;
            ans = Math.max(ans,width * Math.min(height[left],height[right]));
        }
        return ans;
    }

