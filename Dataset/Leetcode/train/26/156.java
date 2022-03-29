 public int XXX(int[] nums) {
        int start = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[start]){
                start = i;
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }

