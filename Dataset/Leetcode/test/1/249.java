 class Solution {
    public int[] XXX(int[] nums, int target) {
    int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            int a = nums[i];
            for (int j = 0; j < length; j++) {
                if (j == i){
                    continue;
                }
                if (a + nums[j] == target){
                    result[0] = a;
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return result;
    }
}

