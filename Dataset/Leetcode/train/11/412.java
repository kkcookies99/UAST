 public int XXX(int[] height) {
        int left = 0, right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            if (height[left] == height[right]) {
                max = Math.max(max, height[left] * (right - left));
                // 左右指针所指的元素相等，左右指针同时移动
                ++left;
                --right;
            } else if (height[left] > height[right]) {
                max = Math.max(max, height[right] * (right - left));
                // 左指针所指的元素大于右指针所指的元素，仅移动右指针
                --right;
            } else {
                max = Math.max(max, height[left] * (right - left));
                // 左指针所指的元素小于右指针所指的元素，仅移动左指针
                ++left;
            }
        }
        return max;
    }

