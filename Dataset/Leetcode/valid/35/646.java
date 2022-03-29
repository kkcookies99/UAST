 public int XXX(int[] nums, int target) {
    int n = nums.length;

    if(target<nums[0]) return 0;
    if(target>nums[n-1]) return n;

    for(int i=0;i<n;i++){
        if(nums[i]==target){
            return i;
        }else{
            if(nums[i]<target && target<nums[i+1] ){
                return i+1;
            }
        }
    }
    return 0;
}

