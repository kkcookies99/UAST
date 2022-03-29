  public int XXX(int[] nums, int val) {
        if(nums==null)
            return -1;
        int count=0;  //count带表!=val值的数目
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(count<i){
                    nums[count]=nums[i];
                    nums[i]=val;
                }
                count++;
            }
        }
        return count;
    }

