 public int XXX(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            if (Character.isDigit(s.charAt(0))) {
                return s.charAt(0) - '0';
            }
            return 0;
        }

        int index = 0;
        //  丢弃前导空格
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }
        if (index < length) {
            boolean isNegative = false;
            if (s.charAt(index) == '-') {
                isNegative = true;
                index++;
            }
            else if (s.charAt(index) == '+') {
                index++;
            }
            //  如果在数字之前先出现了字母、或多余的符号、或小数点，那么就认为没有读入任何数字，所以返回 0
            if (Character.isLetter(s.charAt(index)) || s.charAt(index) == '+' || s.charAt(index) == '-' || s.charAt(index) == '.') {
                return 0;
            }
            //  否则，就说明当前字符是数字，开始处理
            //  先处理可能存在的前导零
            while (index < length && s.charAt(index) == '0') {
                index++;
            }
            //  处理完毕前导零后，如果已经到达字符串的末尾，那么没有其他数字可读入了，就返回 0
            if (index == length) {
                return 0;
            }
            //  否则，就开始把每个数字合并成一个整数
            long result = 0;
            boolean overflowFlag = false;
            while (index < length && Character.isDigit(s.charAt(index))) {
                long current = result * 10 + s.charAt(index) - '0';
                //  合并的过程中，还要记得判断是否存在 long 类型的数据溢出。
                //  判断的方法是：如果当前整数比前一次的整数还小，那么一定是因为数据溢出导致的。此时，就应该跳出循环，并设置 OF = true
                if (current < result) {
                    overflowFlag = true;
                    break;
                }
                result = current;
                index++;
            }
            if (isNegative) {
                result = -result;
            }
            //  如果数字是个正数，并且存在 long 类型的溢出，或者是 int 类型的溢出（但 long 未溢出），都应该返回的是 2^31 - 1
            if ((!isNegative && overflowFlag) || result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            //  如果数字是个负数，并且存在 long 类型的溢出，或者是 int 类型的溢出（但 long 未溢出），都应该返回的是 -2^31
            if ((isNegative && overflowFlag) || result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            //  否则，就说明当前数字在 int 的范围之内，可以正常返回
            return (int) result;
        }
        return 0;
    }

