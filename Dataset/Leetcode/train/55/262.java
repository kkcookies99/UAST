      public boolean XXX(int[] nums) {
             int max=0;
             for(int i=0;i<=max;++i ){
                   max=Math.max(nums[i]+i,max);
                   if(max>=nums.length-1) return true;
             }
             return false;
      }
