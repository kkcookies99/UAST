 public int XXX(int[] nums) {
        boolean same = false;
        for (int i = 0; i < nums.length; i++) {
            same = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    same = true;
                }
            }
            if (same) {
                if (i == nums.length - 1) {
                    if (same) {
                        return i;
                    } else {
                        return i + 1;
                    }
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != nums[i] && !preHas(i, j, nums)) {
                        nums[i] = nums[j];
                        break;
                    }
                    if (j == nums.length - 1) {
                        return i;
                    }
                }
            }
        }
        return nums.length;
    }

    private boolean preHas(int i, int j, int[] nums) {
        for (int m = 0; m < i; m++) {
            if (nums[m] == nums[j]) {
                return true;
            }
        }
        return false;
    }

