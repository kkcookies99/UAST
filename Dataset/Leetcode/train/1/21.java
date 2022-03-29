 class Solution {
	public int[] XXX(int[] nums, int target) {
		Map<Integer, Integer>map=new HashMap<>();//元素值和元素位置的映射
		map.put(nums[0], 0);
		for(int i=1;i<nums.length;i++) {
			int matchedNum=target-nums[i];//nums[i]和matchedNum的索引即为所求
			if(map.containsKey(matchedNum)) {//map存储过matchedNum的映射
				int index1=i;
				int index2=map.get(matchedNum);
				return new int[] {index1,index2};
			}else//map未存储过
				map.put(nums[i], i);
		}
		
		return null;
	}
}```





