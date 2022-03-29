    public void XXX(int[] nums) {
        int zeroIndex = 0,twoIndex = nums.length - 1;
        for (int i = 0; i <= twoIndex; i++) {
            if (nums[i] == 0){
                if (i != zeroIndex){
                    int temp = nums[zeroIndex];
                    nums[zeroIndex] = nums[i];
                    nums[i] = temp;
                    i --;
                }
                zeroIndex ++;
            }
            else if (nums[i] == 2){
                if (i != twoIndex) {
                    int temp = nums[twoIndex];
                    nums[twoIndex] = nums[i];
                    nums[i] = temp;
                    i --;
                }
                twoIndex --;
            }
        }
    }


