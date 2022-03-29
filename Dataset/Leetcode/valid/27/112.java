  public int XXX(int[] nums, int val) {
       int position = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val ){
                nums[position] = nums[i];
                position++;
            }
        }

        return position ;
    }```

执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户

    从0 开始 每个不是的数 指针++  

