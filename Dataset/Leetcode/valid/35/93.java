 public int XXX(int[] nums, int target) {

        int low = 0,high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
        	mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        if (low > high) {
        	return low;
        } else {
        	return high;
        }
    }

