 class Solution {
    public int XXX(int[] nums, int target) {
        int  left=0,right=nums.length-1;
        int t=nums.length;
        while( left < right) {
            int  mid = left+(right-left)/2;
            if(nums[mid] <target ){
                left=mid+1;
            }else{
                right = mid;
            }
        }

        if(nums[left]<target){
            left++;
        }

        return left;

    }
}

