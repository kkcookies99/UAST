 class Solution {
    public int XXX(int[] nums, int target) {
       int Index = Search(nums,target,0,nums.length-1);
       return Index;
    }
    public static int Search(int[] nums,int target,int low,int high){
        int mid = low+(high-low)/2;
        while(low<=high){
            if(target == nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
                return Search(nums,target,low,high);
            }
            else{
                high = mid-1;
                return Search(nums,target,low,high);
            }
        }
        return mid;
    }
}

