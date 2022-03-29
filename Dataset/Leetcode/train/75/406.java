 public void XXX(int[] nums) {
        int n = nums.length;
        int k =0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        
        for(int j=k;j<n;j++){
            if(nums[j] == 1){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }

