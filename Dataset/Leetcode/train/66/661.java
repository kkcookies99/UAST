class Solution {
    public int[] XXX(int[] digits) {
        int index = digits.length - 1;
        do {
            if (digits[index] == 9) {
                if (index == 0) {
                    digits[0] += 1;
                    if (digits[0] > 9) {
                        int[] newDigits = new int[digits.length + 1];
                        newDigits[0] = 1;
                        newDigits[1] = 0;
                        for (int i = 2; i < digits.length; i++) {
                            newDigits[i] = digits[i - 1];
                        }
                        return newDigits;
                    }
                } else {
                    digits[index] = 0;
                }
                index--;
            } else {
                digits[index] += 1;
                return digits;
            }
        } while (index > -1);
        return digits;
    }
}

