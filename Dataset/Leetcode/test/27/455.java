 public int XXX(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        for(int i=0;i<len;i++){
           if((nums[i]^val)!=0){
               nums[index]=nums[i];
               index++;
           }else{
               continue;
           }
        }
        return index;
    }

