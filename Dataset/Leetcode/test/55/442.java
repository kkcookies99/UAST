 class Solution {
    public boolean XXX(int[] nums) {
        int[] shawdow = new int[nums.length];
        shawdow[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            // 当前点未被标记，证明不可达
            if (shawdow[i] == 0) {
                return false;
            }
            // 依次标记当前点可以跳达的地方
            for (int k = nums[i] + i; k >= i; k--) {
                if (k >= nums.length - 1) {
                    return true;
                }
                if (shawdow[k] == 1) {
                    break;
                }
                shawdow[k] = 1;
            }
        }
        return false;
    }
}

