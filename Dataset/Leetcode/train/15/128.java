 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>(nums.length);
		if (nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);
        //创建查找表，将3数相加降维为2数相加
		Map<Integer, Integer> map = new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
        //逆向做法：由因数找和数（效率较低）
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i - 1] != nums[i]) { //去重核心判断
				for (int j = i + 1; j < nums.length; j++) {
					if (j == i + 1 || nums[j - 1] != nums[j]) { //去重核心判断
						int sum = nums[i] + nums[j];
						sum = -sum;
						Integer index = map.get(sum);
						if (index != null) {
							if (index > j) {
								result.add(Arrays.asList(nums[i], nums[j], sum));
							}
						}
					}
				}
			}
		}
		return result;
    }
}

