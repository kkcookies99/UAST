    public void XXX(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                swap(nums, zero++, one++);
            } else if (nums[one] == 2) {
                swap(nums, one, two--);
            } else {
                one++;
            }
        }
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


