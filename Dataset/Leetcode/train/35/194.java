 public int XXX(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    int middle = 0;
    
    if(target > nums[nums.length-1])
        return nums.length;
    if(target < nums[0])
        return 0;
    
    while(low <= high){
        middle = (low + high) / 2;
        if(nums[middle] == target){
            return middle;
        }else if (nums[middle] > target){
            high = middle - 1;           
        }else{
            low = middle + 1;             
        }                       
    }   
    return low;     
}

