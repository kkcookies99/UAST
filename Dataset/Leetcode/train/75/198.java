    public void XXX(int[] nums) {
        int right = nums.length-1;
        int ptr0 = -1; // for the end of 0, ptr + 1 would be the start of the '1'
        int ptr2 = nums.length; // for the start of 2;
        int i = 0;
        while(i<ptr2) {
            if (nums[i] == 0) {
                swap(nums, ++ptr0,i);
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums,--ptr2,i);
            }
        }
        
    }

