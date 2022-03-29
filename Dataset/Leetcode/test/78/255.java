class Solution {
   public List<List<Integer>> XXX(int[] nums) {
		int len = nums.length;
		// 状态压缩 对于每个元素0代表不选1代表选,状态总数是2的len次方-1
		int states = (int) Math.pow(2, len);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < states; i++) {
			List<Integer> path = new ArrayList<>();
			for (int j = 0; j < len; j++) {
				if ((i & (1 << j)) != 0) {
					path.add(nums[j]);
				}
			}
			res.add(path);
		}
		return res;

	}
}

