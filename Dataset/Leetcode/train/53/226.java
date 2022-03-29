class Solution {
    public int XXX(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]>nums[i]+nums[i-1]?nums[i]:nums[i]+nums[i-1];
            if(nums[i]>max)max=nums[i];
        }
        return max; 
    }
} 

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


