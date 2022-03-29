         public int XXX(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val && j == i) {
                    j++;
                    continue;
                }
                if (nums[i] != val && j != i ) {
                    nums[j++] = nums[i];
                }
            }
            return j;
        }

