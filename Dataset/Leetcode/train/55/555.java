 class Solution {
    public boolean XXX(int[] nums) {
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]==0){
                for(int j = i;j>=0;j--){
                    if(nums[j]>(i-j)){
                        if(XXX(Arrays.copyOf(nums,j+1))){
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}

