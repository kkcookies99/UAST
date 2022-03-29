 class Solution {
    public int singleNumber(int[] nums) {
        int tag =0;
        for(int num:nums){
            tag ^=num;
        }
        return tag;
    }
}

