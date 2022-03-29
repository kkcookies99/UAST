 public int[] XXX(int[] digits) {
        int temp = digits[digits.length - 1] = digits[digits.length - 1] + 1;
        if (temp >= 10){
            int[] digits2 = new int[digits.length + 1];
            for (int i = 0; i < digits.length - 1; i++) {
                digits2[i] = digits[i];
            }
            digits2[digits2.length - 1] = temp % 10;
            digits2[digits2.length - 2] = temp / 10;
            return digits2;
        }
        return digits;
    }

