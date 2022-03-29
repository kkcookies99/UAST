 class Solution {
    public void XXX(int[] nums) {
    	if(nums==null||nums.length==0||nums.length==1) {
    		return;
    	}
        int low=0,high = nums.length-1;
        int temp;
        for(int i=0;i<nums.length&&i<=high;i++) {
        	if(nums[i]==2) {
        		while(nums[high] ==2&&high!=i) {
        			high--;
        			if(high==-1) {
        				return;
        			}
        		}
        		temp = nums[i];
        		nums[i] = nums[high];
        		nums[high] = temp;
        		high--;
        	}
        	if(nums[i]==0) {
        		temp = nums[i];
        		nums[i] = nums[low];
        		nums[low] = temp;
        		low++;
        	}        	
        }
    }
}

