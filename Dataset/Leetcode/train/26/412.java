  public int XXX(int[] nums) {
        /**
         * 两个指针移动
         * 一个指针用于换值 一个指针用于移动
         * 举例 {a,b,c,d,e,f,g}
         * 最开始慢指针指向 b 快指针指向 b（从第二个开始是因为第一个值肯定不会重复）
         * 然后快指针移动到 c 如果快指针指向的值c和慢指针的前一个a值不一样
         * 那么替换慢指针的值（将b替换成c） 慢指针向后移动一个单位
         * （为什么是慢前一个值，因为慢指针前面的值都是无重复的，所以只要和前面的比较就可以了）
         * 结束标志是快指针遍历了全部的元素
         */
        if (nums.length==0||nums.length==1){
            return nums.length;
        }
        else {
            int n = 1;
            for (int i = 1 ; i<nums.length;i++){
                if (nums[n-1]!=nums[i]){
                    nums[n] = nums[i];
                    n = n+1;
                }
            }
            return n;
        }
    }

