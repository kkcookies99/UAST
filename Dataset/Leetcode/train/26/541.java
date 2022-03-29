     public int XXX(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        //有序数组
        //快慢指针思想

        //index: 比较指针(当前比较元素的位置)
        int index = 0;
        //i: 数组遍历指针
        int i;
        for (i = 1; i < nums.length; i++) {
             //遍历元素和当前比较索引元素不同，则进行覆盖
             if(nums[i] != nums[index]){
                //在比较元素的下一个位置存入当前num[i]的值
                nums[++index] = nums[i];
            }
        }
        //新数组的长度 = 最后修改的索引位置 + 1
        return index + 1;
    }

