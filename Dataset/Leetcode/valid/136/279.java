 public int singleNumber(int[] nums) {
    int n = nums.length;
    if(n==1) return nums[0];
    int index = 0;
    Arrays.sort(nums);
    for(int i=1;i<n-1;i=i+2){
        if(nums[i]==nums[i-1]){
            index = index + 2;
        }else if(nums[i]!=nums[i-1]){
            index = i-1;
            return nums[index];
        }else if(index == n-1){
            return nums[index];
        }
    }
    return nums[index];
}

