 class Solution {
    public void XXX(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;

        int lastZeroPos = 0, lastTwoPos = nums.length - 1, i = 0;
        while (i <= lastTwoPos) {
            if(nums[i] == 0 ){
                if(i != lastZeroPos)
                    swap(nums, i, lastZeroPos);
                else
                    i++;
                lastZeroPos++;
            }else if(nums[i] == 2) {
                if(i != lastTwoPos)
                    swap(nums, i, lastTwoPos);
                else
                    i++;
                lastTwoPos--;
            }else {
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

