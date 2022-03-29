 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        while(l < r){
            int mid = l + r >> 1;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target)  l = mid + 1;
            if(nums[mid] > target)  r = mid;
        }
        return target>nums[l]?(l+1):l;
    }
}

