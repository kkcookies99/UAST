 public int XXX(int[] nums) {
        if(nums.length== 0) return 0;
        int count = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(temp != num){
                nums[count] = num;
                temp = nums[i];
                count++;
            }
        }
        return count;
    }

