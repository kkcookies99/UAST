 public int XXX(int[] nums, int val) {
            int index = 0;
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == val){
                    nums[index] = val;
                }else{
                    nums[index] = nums[i];
                    index++;
                    num++;
                }
            }
            return num;
    }

