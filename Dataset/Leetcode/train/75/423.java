 class Solution {
    public void XXX(int[] nums) {
        int []colornum = new int[3];
        for(int i = 0; i < 3; i++)
            colornum[i] = 0;
        for(int co : nums) {
            colornum[co]++;
        }
        for(int i = 0; i < colornum[0]; i++) {
            nums[i] = 0;
        }
        for(int j = colornum[0]; j < colornum[1]+colornum[0]; j++) {
            nums[j] = 1;
        }
        for(int k = colornum[1] + colornum[0]; k < nums.length; k++) {
            nums[k] = 2;
        }
    }
}

