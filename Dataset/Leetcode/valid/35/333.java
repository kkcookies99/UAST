 class Solution {
    public int XXX(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]>=target){
                return 0;
            }
            if(nums[0]<target){
                return 1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else{
                if(i==0){
                    if(target<nums[i]){
                        return 0;
                    }
                }else if(i==nums.length-1){
                    if(target>nums[i]){
                        return nums.length;
                    }else{
                        return nums.length-1;
                    }
                }else{
                    if(target>nums[i-1] && target<nums[i]){
                        return i;
                    }
                }
                
                
            }
        }
        return 0;
    }
}

