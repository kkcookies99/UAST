 public int XXX(int[] nums, int val) {
        int len = 0;
        int bottomIdx = nums.length-1;
        while(len <= bottomIdx){
           if(nums[len] == val){
                int temp = nums[bottomIdx];
                nums[bottomIdx] = nums[len];
                nums[len] = temp;
                bottomIdx--;
            }else{
                len++;
            } 
        }
        return len;
    }

