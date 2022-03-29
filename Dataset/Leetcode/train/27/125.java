 public int XXX(int[] nums, int val) {
        // 快慢指针
        int slowIndex = 0;
        for(int fastIndex = 0; fastIndex < nums.length; fastIndex++){
            if(val != nums[fastIndex]){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

