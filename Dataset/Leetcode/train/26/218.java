 class Solution {
    public int XXX(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=1;
        for(int cur=nums[0],i=0;i<nums.length;i++){
            if(cur!=nums[i]){
                nums[count++]=nums[i];
                cur=nums[i];
            }
        }
        return count;
    }
}

