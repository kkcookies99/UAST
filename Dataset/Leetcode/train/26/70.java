 public int XXX(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int size = nums[0];
        int a = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=size){
                nums[a] = nums[i];
                size = nums[i];
                a++;
            }
        }
        return a;
    }

