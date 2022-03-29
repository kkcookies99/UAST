 class Solution {
    List<List<Integer>> lists = new ArrayList<>();
	HashSet<List<Integer>> hashSet = new HashSet<>();

	public List<List<Integer>> XXX(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		for (int left = 0; left <= len - 3; left++) {
			int mid = left + 1;
			int right = len - 1;
			while (mid < right) {
				int sum = nums[left] + nums[mid] + nums[right];
				if (sum < 0) {
					mid++;
				} else if (sum > 0)
					right--;
				else {
					List<Integer> list = new ArrayList<>();
					list.add(nums[left]);
					list.add(nums[mid]);
					list.add(nums[right]);
					hashSet.add(list);
					mid++;
					right--;
				}
			}
		}
		if (hashSet.size() != 0) {
			Iterator<List<Integer>> iterator = hashSet.iterator();
			while (iterator.hasNext()) {
				lists.add(iterator.next());
			}
		}
		return lists;
	}
}

