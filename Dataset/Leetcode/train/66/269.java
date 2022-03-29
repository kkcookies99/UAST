    public int[] XXX(int[] digits) {
        //进位标志
        boolean flag = false;
        int i = digits.length-1;
        //循环终止条件：i的索引不是digits.length-1   进位标志为false
        while (i == digits.length - 1 || flag) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
                flag = true;
            } else {
                digits[i] += 1;
                flag = false;
            }
            i--;
            if (i<0) break;
        }
        if (flag) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

