 class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce((a,b)->a^b).getAsInt();
    }
}

