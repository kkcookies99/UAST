class Solution {
    public void XXX(int[] nums) {
        int[] t = new int[3];
        for(int n:nums){
            t[n] = t[n]+1;
        }
        int count1 =0,count2=0;
        while(count1<nums.length){
            for(int i=0;i<t[count2];i++){
                nums[count1++] = count2;
            }
            count2++;
        }
    }
}

