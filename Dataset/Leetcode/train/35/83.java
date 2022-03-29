 public int XXX(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l <= r) {

            mid = (l + r) >> 1;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

