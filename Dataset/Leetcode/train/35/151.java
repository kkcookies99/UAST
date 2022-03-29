 class Solution {
    public int XXX(int[] nums, int target) {
        // int l=0,r=nums.length-1;
        // while(l<r){
        //     int mid=l+r>>1;
        //     if(target<=nums[mid]) r=mid;
        //     else l=mid+1;
        // }
        // if(nums[r]>=target) return r;
        // else return r+1;
        int res=Arrays.binarySearch(nums,target);
        return res>=0?res:Math.abs(res)-1;
    }
}

