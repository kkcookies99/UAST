 public int XXX(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <=1){
            return nums.length;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[count-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

