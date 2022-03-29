    public int XXX(int[] nums, int target) {
     int left=0,right = nums.length - 1;
     if(target < nums[left]) return 0;
     if(target > nums[right]) return nums.length;
     while(left <= right){
         int mid = (right-left)/2 + left;
         if(target < nums[mid]){
             right = mid - 1;
         }else if(target > nums[mid]){
             left = mid + 1;
         }else{
            return mid;
         }
    }
    return left;
}
