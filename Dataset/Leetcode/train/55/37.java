class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length==1) return true;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&max<=i&&i!=nums.length-1){
                return false;
            }
            max=Math.max(nums[i]+i,max);
        }
        return true;
    }
}

