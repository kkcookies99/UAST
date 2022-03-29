 class Solution {
    public boolean XXX(int[] nums) {
		int maxStep=nums[0];
		for(int i=1;i<nums.length;i++){
			if(maxStep==0) return false;
			maxStep--;
			maxStep=Math.max(maxStep,nums[i]);
		}
		return true;
    }
}

