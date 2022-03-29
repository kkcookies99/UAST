 public int XXX(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return nums.length;
        int temp = nums[0];
        int gap = 0; //记录重复值个数
        a:for(int i = 1;i <= nums.length;i++) {
            while(temp == nums[i + gap]) {
                gap++;
                if(gap + i > nums.length - 1)  //已经取到最后的元素,防止下标越限
                    break a;
            }
            nums[i] = nums[gap + i]; //把后面的值赋给前面
            temp = nums[i];
            if(gap + i == nums.length - 1) //已经取到最后的元素,防止下标越限
                break;         
        }
        nums = Arrays.copyOfRange(nums,0,nums.length - gap);
        return nums.length;
    }

