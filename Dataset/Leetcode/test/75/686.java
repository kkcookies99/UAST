     public void XXX(int[] nums) {
        if (nums.length > 1) {//todo
            int left = 0;//小于left的都为0
            int right = nums.length - 1;//大于right的都为1
            //操作i后小于等于i的都是排序好的0和1
            for (int i = 0; i <= right; i++) {
                if (nums[i] == 2) {
                    while (nums[right] == 2 && right > i) {
                        right--;
                    }
                    nums[i] = nums[right];
                    nums[right] = 2;
                }
                if (nums[i] == 0) {
                    nums[i] = nums[left];
                    nums[left] = 0;
                    left++;
                }
            }
        }
    }

