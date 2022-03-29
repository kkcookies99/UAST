  public int XXX(int[] nums) {
       int pre = nums[0];
       int max = pre;
       for(int i=1;i<nums.length;i++){
        if(pre>0){
            nums[i] +=pre;
        }
        if(nums[i]>max){
            max = nums[i];
        }
        pre = nums[i];
       }
       return max;
    }

