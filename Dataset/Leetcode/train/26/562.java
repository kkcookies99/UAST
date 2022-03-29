 public int XXX(int[] nums) {
		int L = 0, R = 1;
		for(; L < R && R < nums.length; R++) {
			if(nums[L] != nums[R]) {
				swap(nums, ++L, R);
			}
		}
		return L + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
