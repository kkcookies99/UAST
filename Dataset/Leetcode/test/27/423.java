     public int XXX(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;  
        //已知数组无序
        //慢指针：覆盖位置
        int slowPointer = 0;
        //快指针：遍历位置
        int quickPointer = 0;
        while (quickPointer < nums.length) {
            if(nums[quickPointer] != val){
                //覆盖新元素
                nums[slowPointer++] = nums[quickPointer];
            }
            //遍历指针指向下一个元素
            quickPointer++;
        }
        return slowPointer;
    }

