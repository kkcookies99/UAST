 class Solution {
    public int XXX(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int m=(r-l)/2+l;
        if(target==nums[r]){
            return r;
        }
        int min=r+1;
        while(l<=r){
            if(target<=nums[m]){
                min=m;
                r=m-1;
                m=(r-l)/2+l;
                continue;
            }
            l=m+1;
            m=(r-l)/2+l;
        }
        return min;
    }
}

