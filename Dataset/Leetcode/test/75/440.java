 class Solution {
    public void XXX(int[] nums) {
        int temp, i, j;
        int start = 0;
        for (int k = 0; k < 3; k++) {
            j = nums.length - 1;
            i = start;
            while (i < nums.length) {
                while (nums[i] == k && i < j) {
                    i++;
                }
                if (i == j) {
                    start = i;
                    break;
                }
                while (nums[j] != k && i < j) {
                    j--;
                }
                if (i < j) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

