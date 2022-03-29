 class Solution {
    public int singleNumber(int[] nums) {
        var val=0;
        for(var item : nums){
            val^=item;
        }
        return val;
    }
}

