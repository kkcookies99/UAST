 class Solution {
    public void XXX(int[] nums) {
        int len = nums.length;
        int start = 0;
        for(int i=0;i<3;i++){
            for(int j = start;j<len;j++){
                if(nums[j]==i){
                    nums[j]=nums[start];
                    nums[start]=i;
                    start++;
                }
            }
        }
    }
}

