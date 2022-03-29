 public int[] XXX(int[] nums, int target) {
        if (nums.length < 2){
            return null;
        }
        int[] temp = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return null;
    }

