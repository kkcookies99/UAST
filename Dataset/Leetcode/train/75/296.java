class Solution {
    public void XXX(int[] nums) {
        int[] count = new int[3];
        for(int n : nums) {
            count[n]++;
        }
        int i = 0;
        for(int k = 0; k <= 2; k++) {
            while(count[k]-- > 0) {
                nums[i++] = k;
            }
        }
    }
}

