 public int XXX(int[] nums, int val) {
        int length = nums.length;
        int i=0;
        //逐个记录不等于val的元素个数，作为新数组下标
        int z=0;
        while (i<length){
            if (nums[i]!=val){
                nums[z]=nums[i];
                z++;
            }
            i++;
        }
       return z;
    }

