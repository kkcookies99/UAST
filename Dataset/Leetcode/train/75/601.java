     public void XXX(int[] nums) {
        int zero = -1;
        int i = 0;
        int two = nums.length;

        while (i < two) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[zero + 1];
                nums[zero + 1] = temp;
                i++;
                zero++;
            } else {
                int temp = nums[i];
                nums[i] = nums[two - 1];
                nums[two - 1] = temp;
                two--;
            }
        }
    }

