class Solution {
    public int[] XXX(int[] digits) {
        int i = digits.length-1;
        int off = 1;
        do {
            if (digits[i] + off == 10) {
                digits[i] = (digits[i] + off) % 10;
                off = 1;
                if (i == 0) {
                    int[] out = new int[digits.length + 1];
                    out[0] = 1;
                    for (int j = 1; j < out.length; j++) {
                        out[j] = digits[j - 1];
                    }
                    return out;
                }
            } else {
                digits[i] = digits[i] + off;
                return digits;
            }
            i--;
        } while (true);
    }
}

