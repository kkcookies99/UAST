        public int XXX(int[] nums) {
            int number = 0;
            int max = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (number < 0) {
                    number = nums[i];
                } else {
                    number = number + nums[i];
                }
                max = Math.max(max, number);
            }
            return max;
        }

