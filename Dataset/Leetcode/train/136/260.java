 class Solution {
    public int singleNumber(int[] nums) {
        int temp1 = Integer.MAX_VALUE;
        int temp2 = temp1;
        for (int num : nums) {
            temp1 = temp1 ^ num;
        }
        return temp1 ^ temp2;
    }
}

