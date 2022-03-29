public boolean XXX(int[] nums) {
        int size = nums.length;
        int reach = 1;
        for (int i = 2; i <= size; i++) {
            if(nums[size-i]<reach)
                // 如果这个节点不能达到
                reach++;
            else {
                //这个节点可以达到
                reach = 1;
            }
        }
        return reach==1;
    }

