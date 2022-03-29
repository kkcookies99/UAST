    public boolean XXX(int[] nums) {
        int a = 0;
        if(nums.length==0&&nums[0]==0)return false;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0||nums[i]<a+1){
                a++;
            }else{
                a = 0;
            }
        }
        return a==0;
    }

