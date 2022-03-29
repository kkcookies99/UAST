 public int XXX(int[] nums, int target) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                temp = i;
                break;
            } else if (nums[nums.length - 1] < target) {
                temp = nums.length;
                break;
            } else if (nums[0] > target) {
                temp = 0;
            } else if(nums[i] > target) {
                temp = i;
                break;
            }
        }
        return temp;
    }

