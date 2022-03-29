	public List<List<Integer>> XXX(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(new ArrayList<>());
		dfs(0, nums, new ArrayList<>(), ans);
		return ans;
	}

	private void dfs(int start, int[] nums,
					 List<Integer> cur, List<List<Integer>> ans) {
		for (int i = start; i < nums.length; i++) {
			cur.add(nums[i]);
			ans.add(new ArrayList<>(cur));
			dfs(i + 1, nums, cur, ans);
			cur.remove(cur.size() - 1);
		}
	}

