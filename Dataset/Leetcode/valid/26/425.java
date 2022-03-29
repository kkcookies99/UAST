 class Solution {
    public int XXX(int[] nums) {
        if(nums.length==0)return 0;
		int ans=1,j=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>j){
				j = nums[i];
				nums[ans++] = j;
			}
		}
		return ans;	
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


