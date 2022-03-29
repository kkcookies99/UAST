  public int XXX(int[] nums, int target) {

        int n=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                n=i;
                break;
            }

        }
        if(n<0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (target > nums[i]) {
                    n = i+1;
                    break;
                } else {
                    n = 0;
                }

            }
        }
         return n;
    }

