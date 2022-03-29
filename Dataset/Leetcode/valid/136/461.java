     public int singleNumber(int[] nums) {
        //位运算
        int a = nums[0];
        for(int i = 1; i <nums.length;i++){
            a = a ^ nums[i];
        }
        return  a;
    }

