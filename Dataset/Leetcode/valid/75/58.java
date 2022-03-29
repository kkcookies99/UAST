class Solution {
    public void XXX(int[] nums) {
        int[] count = new int[3];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for(int i = 0; i < count[0]; i++) {
            nums[i] = 0;
        }

        for(int i = count[0]; i < count[0] + count[1]; i++) {
            nums[i] = 1;
        }

        for(int i = count[0] + count[1]; i < count[0] + count[1] + count[2]; i++) {
            nums[i] = 2;
        }

    }
}

