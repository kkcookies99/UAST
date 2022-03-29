 public int XXX(int[] nums, int target) {
    int high = nums.length - 1;
     int low = 0;
     while ( low <= high ) {
         int mid = (low + high ) >>1;
         if ( target > nums[mid]) {
             low = mid + 1;
         }else if ( target < nums[mid]) {
             high = mid - 1;
         }else {
             return mid;
         }
     }
     return low;
}

