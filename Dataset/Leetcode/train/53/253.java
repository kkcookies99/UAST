class Solution {
    public int XXX(int[] nums) {
        int max = 0x80000000;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            max=Math.max(temp,max);
            if(temp<=0){
                temp = 0;
            }
        }
        return max;
    }
}

