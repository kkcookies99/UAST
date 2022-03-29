  public int XXX(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val) k++;
        }
        //思路就是：遍历每一位数，如果等于val，就将其替换为当前位后面的第一个不等于val的值，这样就可以把所有不等于val的值提到前面来
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                int j =i+1;
                while (j<nums.length && nums[j]==val) j++;
                if(j<nums.length){
                    nums[i] = nums[j];
                    nums[j] = val;
                }
            }
        }
        return k;
    }

