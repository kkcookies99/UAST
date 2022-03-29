 public void XXX(int[] nums) {
    int head=0, tail=nums.length;
    for(int i=0;i<tail;) {
        if (nums[i] == 0) {
            nums[head++] = 0;
        } else if (nums[i] == 2) {
            nums[i] = nums[tail-1];
            nums[tail-1] = 2;
            tail -= 1;
            continue;
        } 
        i++;
    }
    Arrays.fill(nums, head, tail, 1);
}
