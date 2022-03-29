class Solution {
    public boolean XXX(int[] nums) {
        if(nums==null||nums.length==0) return false;

        return XXX(nums, nums.length, 0);
    }
    public boolean XXX(int[] nums, int n, int index) {
        if(index==n-1){
            return true;
        }
        if(index>n-1) {
            return false;
        }

        int value = nums[index];

        for (int i = 1; i <= value; i++) {
            if(XXX(nums, n, index+i)){
                return true;
            }
        }
        return false;
    }
}

