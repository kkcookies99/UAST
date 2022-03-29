class Solution {
    public boolean XXX(int[] nums) {
     
        
        int j = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=j-i) j=i;
        }
        return j==0? true:false;
    }
}

