 class Solution {
    public boolean XXX(int[] nums) {
        int dis = nums[0];
        for(int i=1;i<nums.length;i++){
            if(dis>=i){
                dis = Math.max(dis,i + nums[i]);
            }
        }
        return dis>=nums.length - 1;
    }
}

