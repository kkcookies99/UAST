class Solution {
    public void XXX(int[] nums) {
        int n = nums.length;
        if (n < 2) return;

        int start = -1, end = n;

        for (int i = 0; i < end;) {
            if (nums[i] == 0) {
                start++;
                if (i == start) {
                    i++;
                } else {
                    swap(nums, start, i);
                }
            } else if (nums[i] == 2){
                end--;
                swap(nums, i, end);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}

