     public int XXX(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int slow = 0;

        for (int fast = 0; fast<nums.length ;fast++) {
            if (set.add(nums[fast])) {
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }   

