class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length < 2) return true;

        boolean flag = false;
        int max = nums[0];

        for(int i = 1; i < nums.length && max != 0; ++i){
            //计算[i]最大能走多远
            max = Math.max(nums[i], max-1);
            
            //i+max 表示从i点出发走的距离
            if(i + max >= nums.length-1){
                flag = true;
                break;
            }
        }
        return flag;
    }
}


