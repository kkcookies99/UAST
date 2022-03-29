   public int XXX(int[] nums, int val) {
        Arrays.sort(nums);
        int left=0;
        //找到val元素所在下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                left = i;
                break;
            }
             if(i+1==nums.length)
                return nums.length;
        }
        //把后面不是val的换到前面
        for (int j = left; j < nums.length; j++) {
            if(nums[j]!=val){
                nums[left]=nums[j];
                nums[j]=val;
                left++;
            }
        }
        return left;
    }

