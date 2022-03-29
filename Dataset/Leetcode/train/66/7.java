 class Solution {
    public int[] XXX(int[] digits) {
        dfs(digits, 0 , digits.length - 1);
        // 排除全为9的情况
        if(digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    private void dfs(int[] digits, int start ,int end) {
        if(start > end) {
            return;
        }
        if(digits[end] != 9) {
            digits[end]++;
            return;
        }
        digits[end] = 0;
        dfs(digits, start, end - 1);
    }
}

