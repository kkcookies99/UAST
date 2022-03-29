     public void XXX(int[] nums) {
        int pointer1 = 0;
        int pointer2 = nums.length - 1;
        for (int i = 0; i <= pointer2; i++) {
            if (nums[i] == 0) {
                swap(i, pointer1++, nums);
            } else if (nums[i] == 2) {
                swap(i, pointer2--, nums);
                i--;
            }
        }
    }

    public void swap(int index, int pointer, int[] nums) {
        if (index == pointer) {
            return;
        }
        int temp = nums[pointer];
        nums[pointer] = nums[index];
        nums[index] = temp;
    }

