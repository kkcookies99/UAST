 class Solution {
    public void XXX(int[] nums) {
     int a=0;
      int b=0;
      int c=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==0)
              a++;
          if(nums[i]==1)
              b++;
          if(nums[i]==2)
              c++;
      }
     
      for(int i=0;i<nums.length;i++)
      {
          if(a!=0)
          {
              nums[i]=0;
              a--;
          }
          else if(b!=0)
          {
        	  nums[i]=1;
        	  b--;
          }
          else
          {
        	 nums[i]=2; 
          }
         
      }
}
}

