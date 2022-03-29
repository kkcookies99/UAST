 class Solution {
    public int XXX(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }

        int i=0,j=nums.length-1;
        while(i<=j){
            int k=(i+j)/2;
            if(nums[k]==target){
                return k;
            }
            if(target<nums[k]){
                if(k>0 && target>nums[k-1]){
                    return k;
                }
                j=k-1;
            }else{
                if(k<nums.length-1 && nums[k+1]>target){
                    return k+1;
                }
                i=k+1;
            }
        }
        return i;
    }
}

