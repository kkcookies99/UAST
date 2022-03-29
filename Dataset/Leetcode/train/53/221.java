class Solution {
    public int XXX(int[] nums) {
		int num = nums[0];
		for(int i=0;i<nums.length;i++) {
			int temp = nums[i];
			for(int j=i+1;j<nums.length;j++) {
				temp+=nums[j];
				if(temp > nums[i]) {
					nums[i] = temp;					
				}
			}
			if(nums[i] > num) {
				num = nums[i];
			}
		}
		return num;
    }
}

