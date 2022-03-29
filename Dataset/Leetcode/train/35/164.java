 public int XXX(int[] nums, int target) {
        int low = 0;
        int height = nums.length - 1;
        while (low <= height) {
            int mid = (low + height) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                height = mid - 1;
            }
        }
        return low;
    }

