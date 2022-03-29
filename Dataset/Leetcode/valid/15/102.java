 public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
		int left, right, sum, len = nums.length;
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] > 0) break;
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			left = i + 1;
			right = len - 1;
			while (left < right) {
				sum = nums[left] + nums[right] + nums[i];
				if (sum < 0) left++;
				else if (sum > 0) right--;
				else if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (left < right && nums[left + 1] == nums[left]) left++;
					while (left < right && nums[right - 1] == nums[right]) right--;
					left++;
					right--;
				}
			}
		}
		return list;
    }

