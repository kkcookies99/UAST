 class Solution {
   public static int singleNumber(int[] nums) {
		 int ans = 0;
		 HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 if(hash.containsKey(nums[i])) {
				 int temp = hash.get(nums[i]);
				 temp++;
				 hash.put(nums[i], temp);
			 }
			 else hash.put(nums[i], 1);
		 }
		 for(int i = 0; i < nums.length; i++) {
			 if(hash.get(nums[i]) == 1) return nums[i];
		 }
		 return ans;
	    }
}

