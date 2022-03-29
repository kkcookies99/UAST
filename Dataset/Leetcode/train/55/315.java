public boolean XXX(int[] nums) {
    int maxReach = 0;
    for(int i = 0; i < nums.length; i++) {
        if(i>maxReach) {
            return false;
        }
        if(i+nums[i] > maxReach) {
            maxReach = i+nums[i];
        }
        if(maxReach >= nums.length-1) {
            return true;
        }
    }
    return true;
}
