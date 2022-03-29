 public void XXX(int[] nums) {
        int start=0,end=nums.length-1,i=0;
        while(i<=end){
            if(nums[i]==0){
                swap(nums,start,i++);
                start++;
            }else if(nums[i]==2){
                swap(nums,i,end--);
            }else{
                i++;    
            }
        }
    }
    
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

