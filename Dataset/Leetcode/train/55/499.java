 class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 0|| nums.length == 1 || nums[0] >= nums.length - 1) {
            return true;
        }

        int begin = 1,maxDis = nums[0],end = nums[0];
        while(true){
            int cam = maxDis;
            for(; begin <= end;begin++){
                maxDis = Math.max(maxDis,begin + nums[begin]);
            }
            if(maxDis >= nums.length - 1){
                return true;
            }else if(maxDis == cam){
                return false;
            }
            begin = cam + 1;
            end = maxDis;
        } 
       
    }
}

