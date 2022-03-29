 class Solution {
    public int XXX(int[] nums, int target) {
        int position = 0;
        if (target <= nums[0]) {
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target== nums[nums.length - 1]) {
            return nums.length-1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (target > nums[i] && target < nums[i + 1]) {
                    position = i + 1;
                    break;
                }
                if (target == nums[i]) {
                    position = i;
                    break;
                }

            }

        }
        return position;

    }
}

