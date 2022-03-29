 class Solution {

    public int XXX(int[] nums) {
        int len = nums.length;
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                nums[i] = 10001;
                len--;
            } else {
                temp = nums[i];
            }
        }
        
        Arrays.sort(nums);
        return len;
    }
}

