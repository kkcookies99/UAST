class Solution {
    public void XXX(int[] nums) {
        final int RED = 0, WHITE = 1, BLUE = 2;
        int redCount = 0, whiteCount = 0;
        for (int i : nums) {
            switch (i) {
                case RED:
                    redCount++;
                    break;
                case WHITE:
                    whiteCount++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (redCount-- > 0) {
                nums[i] = RED;
            } else if (whiteCount-- > 0) {
                nums[i] = WHITE;
            } else {
                nums[i] = BLUE;
            }
        }
    }
}

