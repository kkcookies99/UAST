 class Solution {
    public int[] XXX(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			int df = target - nums[i];
			Integer idx2 = map.get(df);
			if(df == nums[i] && idx2 == i)
				continue;
			if(idx2 != null) {
				int[] indexs = new int[2];
				indexs[0] = i;
				indexs[1] = idx2;
				return indexs;
			}	
		}
		return null; 
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


