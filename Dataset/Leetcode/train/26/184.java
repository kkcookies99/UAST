     public int XXX(int[] nums) {
        int len = nums.length;
        for (int i = 0, j = 0; i < len; i++) {
            while (j + 1 < len && nums[i] == nums[j+1]) {
                j++;
            }
            int edge = j - i;
            while (i != j && j < len) {
                nums[j-edge] = nums[j];
                j++;
            }
            j = i + 1;
            len -= edge;
        }
        return len;
    }


