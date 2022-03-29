 class Solution {
    public int singleNumber(int[] nums) {
          int a=0;
        for (int j: nums ) {
            a^=j;
        }
        return a;

    }
}

