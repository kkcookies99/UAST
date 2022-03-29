    public int XXX(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] == val && right > left) {
                swap(nums, left, right);
                right--;
            }
            left++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return nums.length;
    }

    private void swap(int[] nums, int i, int j) {
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }

