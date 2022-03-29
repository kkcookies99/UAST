  public void XXX(int[] nums) {
            int[] n =new int[3];
         for(int i=0;i< nums.length;i++){
             if(nums[i]==0)
                 n[0]++;
             else if(nums[i]==1)
                 n[1]++;
             else if(nums[i]==2)
                 n[2]++;
         }
         for(int i=0;i<nums.length;i++){
             if(i<n[0])
                 nums[i]=0;
             else if(i-n[0]<n[1])
                 nums[i]=1;
             else
                 nums[i]=2;
         }
    }

