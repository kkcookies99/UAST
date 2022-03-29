 public int XXX(int[] nums, int target) {

    int len = nums.length;
    int left = 0,right = len - 1;
    while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid] > target){
            right = mid - 1;
        }else if(nums[mid] < target){
            left = mid + 1;
        }
    }
    return right + 1;
}
