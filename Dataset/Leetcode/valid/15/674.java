 public List<List<Integer>> XXX(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			HashMap map = new HashMap();
			for (int j = i+1; j < nums.length; j++) {
				if (map.containsKey(0-nums[i]-nums[j])){
					Integer[] ints = {nums[i], 0 - nums[i] - nums[j] , nums[j]};
					set.add(Arrays.asList(ints));
				}else {
					map.put(nums[j],j);
				}
			}
		}
		return  new ArrayList<>(set);
    }

