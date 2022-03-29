 class Solution {
    static final int value = 101;
    public int XXX(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int flag1 = 0;
        int flag2 = 0;
        int count = 0;
        while(flag1 < n - 1){
            flag2 = flag1 + 1;
            while(flag2 < n && nums[flag1] == nums[flag2]){
                nums[flag2++] = value;
                count++;
            }
            flag1 = flag2;
        }
        Arrays.sort(nums);
        return n - count;
    }
}

