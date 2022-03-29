class Solution {
    public boolean XXX(int[] nums) {
        int[] map = new int[nums.length];
        return jump(nums, map, 0);
    }

    public boolean jump(int[] nums, int[] map, int cur){
        if (cur >= nums.length - 1){
            return true;
        }
        for (int i = 0; i < nums[cur]; i++) {
            boolean jump = false;
            if (map[cur + i + 1] == 2){
                jump = true;
            }else if (map[cur + i + 1] == 1){
            }else {
                jump = jump(nums, map, cur + i + 1);
            }
            if (jump){
                map[cur + i + 1] = 2;
                return true;
            }else {
                map[cur + i + 1] = 1;
            }
        }
        return false;
    }
}

