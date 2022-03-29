class Solution {
    public void XXX(int[] nums) {
        int i = 0, a = 0, b = nums.length - 1;
        while (i <= b) {
            if (nums[i] == 0) {
                if (i == a) {
                    i++;
                    a++;
                } else {
                    int temp = nums[a];
                    nums[a++] = nums[i];
                    nums[i] = temp;
                }
            } else if (nums[i] == 2) {
                int temp = nums[b];
                nums[b--] = nums[i];
                nums[i] = temp;
            } else {
               i++;
            }
        }
    }
}

