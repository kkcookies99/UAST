 public int XXX(int[] nums, int target) {
        int left = 0;   
        int right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > target) {
                // target 在左区间，在[left, middle)中
                right = middle;
            } else if (nums[middle] < target) {
                // target 在右区间，在[middle + 1, right)中
                left = middle + 1;
            } else {
                // 数组中找到目标值，直接返回下标
                return middle;
            }
        }
        return left;
    }

