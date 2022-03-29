 public int XXX(int[] nums, int target) {
		// 有序数组，二分查找
		int begin = 0;
		int end = nums.length-1;
		while (begin <= end) {
			int mid = (begin+end)/2;
			if (target > nums[mid]) {
				begin = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return end+1;
    }

