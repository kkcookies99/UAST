 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return len;
        }
        
        int i=0;
        for(int j=1;j<len;j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
