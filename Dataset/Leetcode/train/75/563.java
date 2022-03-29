 class Solution {
    public void XXX(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int cur = 0;
        while ( cur <= end && start < end){
            if (nums[cur]==0){
                swapNum(nums,cur,start);
                start++;
                cur++;
            }else if (nums[cur]==2){
                swapNum(nums,cur,end);
                end--;
            }else {
                cur++;
            }

        }
    }
    
    private void swapNum(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

