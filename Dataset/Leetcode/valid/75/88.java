public void XXX(int[] nums) {
        int n=nums.length;
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s1++;
            }else if(nums[i]==1){
                s2++;
            }
        }
        for(int i=0;i<s1;i++){
            nums[i]=0;
        }
        for(int i=s1;i<s1+s2;i++){
            nums[i]=1;
        }
        for(int i=s1+s2;i<n;i++){
            nums[i]=2;
        }
    }

