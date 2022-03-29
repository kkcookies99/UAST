     public int XXX(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] != val) i++;
            while (i < j && nums[j] == val) j--;
            swap(nums, i, j);
        }
        int cnt = 0;
        for (int num : nums) {
            if (num == val)
                cnt++;
        }
        return nums.length - cnt;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

