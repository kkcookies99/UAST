 class Solution {
    public int XXX(int[] nums, int target) {
        return binarySearch(nums,0,nums.length,target);
    }
    public static int binarySearch(int[] nums,int left,int right,int val){
       if(right==left)
           return left;
       int midIndex=left+(right-left)/2;
       int midVal=nums[midIndex];
       if(val==midVal)
           return midIndex;
       else if(val>midVal)
           return binarySearch(nums,midIndex+1,right,val);
       else
           return binarySearch(nums,left,midIndex,val);
    }
}

