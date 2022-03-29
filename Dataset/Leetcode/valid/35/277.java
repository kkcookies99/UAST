  public int XXX(int[] nums, int target) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            
            if(nums[j] >= target){
                break;
            }
            i++;
        }
        return i;
    }

