 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = 0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid]<target){
                //如果离target最近的数字比target小,那target应该插在这个数字后面
                ans = mid+1;
                left = ans;
            }
            else{
                //如果离target最近的数字比target大,那target应该插在这个数字的位置
                ans = mid;
                right = ans-1;
            }
        }
        return ans;
    }
}

