 public int XXX(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int sub = nums.length - 1;
        int result = 0;
        while (true) {
            if (sub < 0) {
                break;
            } else if (nums[sub] < target) {
                result = sub + 1;
                break;
            } else if (nums[sub] == target) {
                result = sub;
                break;
            } else {
                sub--;
            }
        }
        return result;
    }

