class Solution {
    public boolean XXX(int[] nums) {
        //遍历每一个，看看能不能reach
        int reach = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(i>reach){
                return false;
            }
            reach = Math.max(reach,i+nums[i]);
            if(reach>=len-1){
                return true;
            }
        }
        return true;
    }
}

