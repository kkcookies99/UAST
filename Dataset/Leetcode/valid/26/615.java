 public int XXX(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        //两个元素及其以上才有可能重复元素
        int ans = 0;
        for (;ans<len-1;ans++){
            if (nums[ans+1] == nums[ans]){
                break;
            }
        }
        for (int j = ans+1; j < len; j++) {
            if (nums[j] != nums[ans]) {
                nums[++ans] = nums[j];
            }
        }
        return ans+1;
    }

