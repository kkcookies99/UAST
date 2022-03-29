class Solution {
    public int XXX(int[] nums) {
        return maxSub(nums, 0, nums.length-1);
    }

    public int maxSub(int[] nums, int front, int late){
        if(front == late){
            return nums[front];
        }
        int mid = (front+ late)/2;
        int a = maxSub(nums, front, mid);
        int b = maxSub(nums, mid+1, late);
        int left = 0;
        int sum = nums[mid];
        for(int i=mid; i>=front; i--){
            left += nums[i];
            sum = Math.max(sum, left);
        }
        int right = 0;
        int sum2 = nums[mid+1];
        for(int i = mid+1;i<=late; i++){
            right += nums[i];
            sum2 = Math.max(sum2, right);
        }
        return Math.max((Math.max(a, b)), sum+sum2);
    }
}



