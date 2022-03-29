 public int XXX(int[] nums, int target) {
    int result = Arrays.binarySearch(nums, target);
		
    return result >= 0 ? result : -result - 1;
}

