class Solution {
    public boolean XXX(int[] nums) {
        for(int i=1;i<nums.length;i++){
            boolean reach=false;
            for(int j=1;j<=i;j++){
                if(nums[i-j]>=j) {reach=true;break;}
            }
            if(reach) i+=nums[i];
            else return false;
        }
        return true;
    }
}

