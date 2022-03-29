 class Solution {
    public int[] XXX(int[] nums, int target) {
        int [] result = new int[2];
        for(int pre = 0; pre< nums.length-1; pre++) {
            for (int last = pre+1; last < nums.length; last++) {
                if((nums[pre] + nums[last]) == target) {
                    result[0] = pre;
                    result[1] = last;
                    return result;
                } 
            }
        }
        return null;
    }
}

