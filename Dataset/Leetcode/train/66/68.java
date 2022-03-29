 class Solution {
    public int[] XXX(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        int[] res;
        if (digits[0] == 0) {
            res = new int[length+1];
            res[0] = 1;
        } else return digits;
        return res;
    }
}

