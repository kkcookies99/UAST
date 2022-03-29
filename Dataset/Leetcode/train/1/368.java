 class Solution {
    public int[] XXX(int[] nums, int target) {
        int indexArrayMax = 2047;
        int[] indexArrays = new int[indexArrayMax + 1];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int index = diff & indexArrayMax;
            if (indexArrays[index] != 0) {
                return new int[] { indexArrays[index] - 1, i };
            }
            indexArrays[nums[i] & indexArrayMax] = i + 1;
        }
        throw new IllegalArgumentException("No two sum value");
        //投机取巧的做法，这种算法在以下测试用例中是无法通过的：
        //[59151,26383,11,9999]
        //36382
        
    }
}

