 class Solution {
	public int[] XXX(int[] nums, int target) {
		int[]nums2= Arrays.copyOf(nums,nums.length);
		Arrays.sort(nums);
		int i=0,j=nums.length-1;
		while(nums[i]+nums[j]!=target) {
			if(nums[i]+nums[j]<target)
				i++;
			else if(nums[i]+nums[j]>target)
				j--;
		}
		
		int r1=0,r2=0;
		for(int k=0;k<nums2.length;k++)
			if(nums2[k]==nums[i]) {
				r1=k;
				break;
			}
		
		for(int k=nums2.length-1;k>=0;k--)
			if(nums2[k]==nums[j]) {
				r2=k;
				break;
			}
		return new int[] {r1,r2};
	}
}

