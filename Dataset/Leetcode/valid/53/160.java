class Solution {
    public int XXX(int[] nums) {
        int x = nums[0];
        int y = 0;
        for(int num : nums) {
            if(y > 0) {
                y += num;
            } else {
                y = num;
            }
            x = Math.max(x,y);
        }
        return x;
    }
}

