     public int XXX(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return remove(nums, 0, nums.length);
    }

    public int remove(int[] nums, int low, int n) {
        if (n == 1 || low >= n - 1) return n;
        int high = low;
        while (high < n - 1 && nums[low] == nums[high + 1]) {
            high++;
        }
        if (low < high) {
            for (int i = low + 1; i < n - high + low; i++) {
                nums[i] = nums[i + high - low];
            }
        }

        return remove(nums, low + 1, n - high + low);

    }

