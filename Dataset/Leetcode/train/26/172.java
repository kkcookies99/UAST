 public int XXX(int[] nums) {
        int front = 0;

        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[front] != nums[i] ) {
                if ( i - front++ > 1 ) {
                    // 可以交换
                    nums[front] = nums[i];
                }
            }
        }

        return front + 1;
    }

