public int XXX(int[] nums) {
    return divide(nums, 0, nums.length-1);        
}

//分治算法
private int divide(int[] nums, int left, int right){
    if(left == right) return nums[left];
    if(left == right - 1){
        int max;
        max = Math.max(nums[left], nums[right]);
        max = Math.max(max, nums[left] + nums[right]);
        return max;
    }
    
    int mid  = (left + right) >> 1;
    int lSum = divide(nums, left, mid - 1);
    int rSum = divide(nums, mid + 1, right);
    
    int max = nums[mid];
    int sum = max;
    for(int i = mid - 1; i >= left; i--){
        sum += nums[i];
        max = Math.max(max, sum);
    }
    
    sum = max;
    for(int j = mid + 1; j <= right; j++){
        sum += nums[j];
        max = Math.max(max, sum);
    }
    
    max = Math.max(max, lSum);
    max = Math.max(max, rSum);
    return max; 
}
