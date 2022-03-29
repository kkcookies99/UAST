class Solution {
    public int XXX(int[] nums) {
        int temp=nums[0];
        int max=temp;
        for(int i=1;i<nums.length;++i) {
            if(temp<=0) {
                temp=nums[i];
            } else {
                temp+=nums[i];
            }
            if(temp>max) {
                max=temp;
            }
        }
        return max;
    }
}

