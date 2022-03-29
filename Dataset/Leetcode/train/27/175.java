 public int XXX(int[] nums, int val) {
        int k = nums.length;
        int left=0,right=1;
        if(k==0)return 0;
        if(k==1&&nums[0]==val)return 0;
        while(right<k){
            if(nums[left]==val){
                nums[left]=nums[right];
                right++;
            }else{
                left++;
                nums[left]=nums[right];
                right++;
            }
        }
        return nums[left]==val?left:left+1;
    }

