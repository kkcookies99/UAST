 class Solution {
    public int XXX(int[] nums) {
       if(nums==null || nums.length==0){return 0;}
       if(nums.length==1){return 1;}
       else{
           int slowindex=1;
          for(int fastindex=1; fastindex<nums.length; fastindex++)
          {
             int fastindex_copy=fastindex-1;
             if(nums[fastindex_copy] != nums[fastindex])
             {nums[slowindex++]=nums[fastindex];}
          }
          return slowindex;
       }
    }
}

