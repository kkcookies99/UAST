 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int pre=0,cur=0,aft=0;

        for (int i = 0; i < nums.length; i++) {

            if (i - 1 < 0){
                pre = nums[0] - 1;
            } else {
                pre = nums[i - 1];
            }

            cur = nums[i];

            if (i + 1 > nums.length - 1){
                aft = nums[nums.length -1] + 1;
            } else {
                aft = nums[i + 1];
            }

            if (pre != cur && cur != aft){
                return cur;
            }
        }

        return 0;

    }
}

