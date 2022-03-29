 public void XXX(int[] nums) {
        int redIdx = 0;
        int blueIdx = nums.length - 1;

        for (int k = 0; k < nums.length; k++) {
            switch (nums[k]) {
                case 0:
                    redIdx++;
                    break;
                case 2:
                    blueIdx--;
                default:
                    break;
            }
        }

        for (int k = 0; k < redIdx; k++) {
            nums[k] = 0;
        }

        for (int k = redIdx; k <= blueIdx; k++) {
            nums[k] = 1;
        }
        for (int k = blueIdx + 1; k < nums.length; k++) {
            nums[k] = 2;
        }

    }

