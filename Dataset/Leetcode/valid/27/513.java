     public int XXX(int[] nums, int val) {
        // 双指针
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }

