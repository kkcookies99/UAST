public boolean XXX(int[] nums) {
       int len= nums.length;
        int target = len - 1;
        int max = nums[0];
        for (int i = 0; i < len;i++) {
            //1.计算可达目标
            int temp = i + nums[i];
            if (temp >= target){
                return true;
            }
            max = Math.max(temp,max);
            if (nums[i] == 0 && i >= max){
                return false;
            }
        }
        return false;
    }

