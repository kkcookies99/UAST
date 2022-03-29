 public int XXX(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;

        //p+1为填充位置，q为读取位置
        int p = -1, q = 0;
        while(q < nums.length){
            //q位置不为排除的元素就向p+1位置填充
            if(nums[q]!=val){
                //如果p+1==q则没必要复制了
                if((p+1)<q) nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }

