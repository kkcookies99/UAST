      public void XXX(int[] nums) {
        int left=0,cur=0;
        int right=nums.length-1;
        while(cur<=right){
            if(nums[cur]==0){
                swap(nums,left,cur);
                left++;
                cur++;
            }else if(nums[cur]==2){
                swap(nums,right,cur);
                right--;
                cur++;
            }else{
                cur++;
            }
        }
    }
    private void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

