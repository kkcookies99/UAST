class Solution {
    public int XXX(int[] nums) {
           if(nums.length==0||nums==null) return 0;
		return XXX(nums,0,nums.length-1);
    }
    static int XXX(int nums[],int l,int r) {
			
		if(l>=r) return nums[l];
		int mid=(l+r)/2;
	
		int leftMax=Integer.MIN_VALUE;
		int leftSum=0;
		
		for(int i=mid;i>=l;i--) {
			leftSum+=nums[i];
			leftMax=Math.max(leftMax, leftSum);
			
		}
	    int rightMax=Integer.MIN_VALUE;
	    int rightSum=0;
	
	    for(int i=mid+1;i<=r;i++) {
	    	rightSum+=nums[i];
	    	rightMax=Math.max(rightMax, rightSum);
	    	
	    }    
		return Math.max(
				//表明有一部分在左边，有一部分在右边
				leftMax+rightMax, 
				//表明子序列和全部在左边
				Math.max(XXX(nums,l,mid), 
						//表明子序列和全部在右边
						XXX(nums, mid+1,r)
						)
				);
    }
}

