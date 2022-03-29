 class Solution {
    public boolean XXX(int[] nums) {
         int len = nums.length-1;
        for(int i=0;i<nums.length;){
            int maxidx = i;
            for(int j=maxidx+1;j<=maxidx+nums[maxidx] && j<nums.length;j++){
                if((len-j-nums[j])<(len-maxidx-nums[maxidx])){   //选择离右端点最近的数的下标
                    maxidx = j;
                }
            }
            i = maxidx + nums[maxidx]; //从该点开始跳
            if(i>=len){
                break;
            }
            if(nums[i] == 0){
                return false;
            }
        }
        return true;
    }
}

