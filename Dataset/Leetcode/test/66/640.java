class Solution {
    public int[] XXX(int[] digits) {
        int add = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i];
            digits[i] = (digits[i] + add) % 10;
            add = (temp + add) / 10;
        }
        if (add == 1) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                array[i + 1] = digits[i];
            }
            return array;
        } else {
            return digits;
        }
    }
}

