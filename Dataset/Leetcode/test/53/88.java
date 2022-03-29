    public int XXX(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            int tmp = sum + num;
            sum = Math.max(tmp, num);
            max = Math.max(max, sum);
        }
        return max;
    }

