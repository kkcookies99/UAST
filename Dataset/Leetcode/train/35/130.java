 public int XXX(int[] nums, int target) {
        if(nums==null||nums.length==0) return 0;
        Random random = new Random();
        int len = nums.length;
        while (true) {
            int n = random.nextInt(len);
            if(nums[n] == target) return n;
            if(n==0&&target<nums[0]) return 0;
            if(n==len-1&&target>nums[n]) return n+1;
            if(n>0&&nums[n-1]<target&&target<nums[n]) return n;
        }
    }

