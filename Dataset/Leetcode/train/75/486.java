 class Solution {
    public void XXX(int[] nums) {
         if (nums == null) {
			return;
		}
        int[] map = new int[3];
        for(int i=0;i<nums.length;i++){
        	map[nums[i]] = map[nums[i]] +1;
        }
        int i = 0;
        for (int j = 0; j < 3; j++) {
		for (int j2 = 1; j2 <=map[j]; j2++) {
			nums[i++] = j;
		}
	}
    }
}

