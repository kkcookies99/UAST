     public int XXX(int[] nums) {
        if(nums.length == 0)    return 0;
        int temp = nums[0];
        int length = 1;
        for(int i = 1;i < nums.length;i++){
            //不同时，就可以将不同的值赋给不同长度对应的下标——将相同的值直接替换
            if(nums[i] != temp){
                temp = nums[i];
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

