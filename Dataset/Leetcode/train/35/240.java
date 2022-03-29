   class Solution {
    public int XXX(int[] nums, int target) {
     return binnarySearch(nums,0,nums.length-1,target);
    }
    public int binnarySearch(int[] nums,int l,int r,int target){
        if (l>r){
            return l;
        }
        int mid=l+((r-l)>>1);
        int t=nums[mid];
        if (t==target){
            return mid;
        }else if (t>target){
            return binnarySearch(nums,l,mid-1,target);
        }else{
            return binnarySearch(nums,mid+1,r,target);
        }
    }
}

