 class Solution {
    public boolean XXX(int[] nums) {
        int high = nums.length - 1;
        while(high > 0){
            int next = high - 1;
            while(next >= 0 && high - next > nums[next]){
                -- next;
            }
            high = next;
        }
        return high == 0;
    }
}

