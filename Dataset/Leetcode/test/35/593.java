 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int count1 = 0, count2 = 0;
        while(left <= right){
            int mid = ((right - left)>>1)+left;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
                count1++;
            } else{
                right = mid - 1;
                count2++;
            }
        }
        if(count1 > count2){
            return left;
        }else{
            return ++right;
        }
    }
}

