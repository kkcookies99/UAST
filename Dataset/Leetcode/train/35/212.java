 public int XXX(int[] nums, int target) {
    int length = nums.length;
    for(int i=0;i<length;i++){
        if(nums[i]==target){
            return i;
        }else if(nums[i]>target){
            return i==0?0:(i);
        }
    }
    return length;
}

