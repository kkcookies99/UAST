 public int XXX(int[] nums, int val) {
    int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[j]=nums[i];
            j++;
        }
        else{
            for(int k=1;k<nums.length-i;k++){
               if (nums[i+k]!=val){
                    nums[j]=nums[i+k];
                    j++;
                    i=i+k;                         
                    break;
               }
            }
        }
    }
    return j;
}

