     public int[] XXX(int[] digits) {
        // 进位，题目要求+1，所以这里直接默认个位数进位1，然后直接加
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + carry;
            if (digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
            }else {
                carry = 0;
                break;
            }
        }
        // 首位还需进位，new个数组把进位放进去
        if (carry == 1) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = carry;
            System.arraycopy(digits, 0, newArr, 1, newArr.length - 1);
            return newArr;
        }
        return digits;
    }


