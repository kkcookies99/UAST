 public void XXX(int[] nums) {
        int white = Integer.MAX_VALUE;
        int blue = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int index = Math.min(white, blue);
                if (index < i) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    if (nums[i] == 2)
                        blue++;
                    if (nums[i] == 1) {
                        white++;
                        if (i > blue)
                            i--;
                    }
                }
            }
            else if (nums[i] == 1) {
                if (blue < i) {
                    int temp = nums[blue];
                    nums[blue] = nums[i];
                    nums[i] = temp;
                    white = Math.min(white, blue);
                    blue++;
                }else
                    white = Math.min(white, i);
            }
            else if (nums[i] == 2) {
                blue = Math.min(i, blue);
            }
        }
    }

