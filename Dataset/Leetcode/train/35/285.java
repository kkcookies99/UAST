 class Solution {
    public int XXX(int[] nums, int target) {
       //经典二分
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
      //比较taget与nusm[mid]的值确定位置
        return target > nums[mid] ? mid+1 : mid;
    }
}

