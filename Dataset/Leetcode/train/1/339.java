 public int[] XXX(int[] nums, int target) {
	//使用HashMap标记已经遍历过的元素及其索引.
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < nums.length; i++) {
		//得到target和当前元素的差.
		int sub = target-nums[i];
		//判断这个差值是否之前已经被加入map中，如果是，则直接返回最终结果.
		if (map.containsKey(sub)) {
			return new int[] {map.get(sub), i};
		}else {
		//如果否，则将当前元素加入到map中.	
			map.put(nums[i], i);
		}
	}
	//若此时返回，则返回2个元素的空数组.
	return new int[2];
}
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


