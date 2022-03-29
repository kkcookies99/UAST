  public int XXX(int[] nums) {
       int index=-1;
       int i=0;
       while (i<nums.length){
           while (i+1<nums.length&&nums[i]==nums[i+1]){
               i++;
           }
           nums[++index]=nums[i++];
           
       }
       return index+1;
    }

