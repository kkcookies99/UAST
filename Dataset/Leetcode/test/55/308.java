class Solution {
    public boolean XXX(int[] nums) {
    	if (nums.length == 1) return true;

    	for(int i=nums.length-2; i>=0; i--) {
    		if(nums[i] == 0){
    			if(i == 0) return false;
    			for(int j=i-1; j>=0; j--) {
    				if(nums[j] > i-j) break;
    				else if(j==0) return false;
				}
			}
		}

    	return true;
    }
}


