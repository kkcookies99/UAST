 class Solution {
    public int XXX(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
    
        if(target<nums[l])
            return 0;
        if(target>nums[r]){
            return r+1;
        }
        while(l<r){
            int mid=(l+r)/2;
            if(target==nums[mid])
                return mid;
            if(target==nums[r])
                return r;
            if(target==nums[l])
                return l;
            
            if(target<nums[mid]){
                r=mid;
            }else{
                l=mid;
            }
            if(l+1==r&&target>nums[l]&&target<nums[r])
                return l+1;
        }
        return l;
    }
}

