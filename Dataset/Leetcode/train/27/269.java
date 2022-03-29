         public int XXX(int[] nums, int val) {
        int pLeft = 0;
        int pRight = 0;
        while (pRight < nums.length) {
            if (nums[pRight] != val) {
                nums[pLeft++] = nums[pRight];
            }
            pRight++;
        }
        return pLeft;
    }

