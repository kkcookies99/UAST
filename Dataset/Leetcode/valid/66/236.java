    public int[] XXX(int[] digits) {
        int length = digits.length;
        int jin = 1;
        for (int i = length - 1; i >= 0; i--) {
            int temp = digits[i] + jin;
            if (temp == 10) {
                digits[i] = 0;
                jin = 1;
            } else {
                digits[i] = temp;
                jin = 0;
            }
        }
        // 扩容
        if (digits[0] == 0) {
            int newLength = length + 1;
            int[] newArr = new int[newLength];
            newArr[0] = 1;
            for (int i = 1; i < newLength; i++) {
                newArr[i] = digits[i - 1];
            }
            return newArr;
        }
        return digits;
    }

