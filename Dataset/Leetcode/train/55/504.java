 class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length, max = 0;
        for(int i=0;i<len;){
            while(i<len&&nums[i]!=0){
                max = Math.max(max,i + nums[i]);
                i++;
            }
            if(max>=len-1){
                return true;
            }else if(max>i){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}

