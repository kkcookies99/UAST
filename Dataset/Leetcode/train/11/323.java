public int XXX(int[] height) {
        int i = 0, j = height.length - 1, XXX = 0;
        int leftMax = height[i];
        int rightMax = height[j];
        while (i != j) {
            XXX = Math.max(XXX, (j - i) * Math.min(height[i], height[j]));
            if (height[i] <= height[j]) {
                // 在移除左边指针的时候，其实可以判断下向右移动的位置中，是不是大于一开始移动的初始位置的值,否则就可以一直向右移动指针
                // 因为在j-i(距离减少)的同事,移动后的位置的值必须大于一开始移动的值，才有可能产生更大的面积
                while (height[i] <= leftMax && i < j) {
                    i++;
                }
                leftMax = height[i];
            } else {
                // 移动右边指针的时候同理。
                while (height[j] <= rightMax && i < j) {
                    j--;
                }
                rightMax = height[j];
            }
        }
        return XXX;
    }

