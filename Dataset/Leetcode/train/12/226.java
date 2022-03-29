 public String XXX(int num) {
        String[] te = {"I", "V", "X", "L", "C", "D", "M"};
        StringBuilder result = new StringBuilder();
        //1表示个位数，2百位 3千位
        int temp = 1;
        while (num != 0) {
            int a = num % 10;
            int base = (temp << 1) - 1;
            //两种情况，余数就是大于5和小于5
            if (a <= 5) {
                //余数小于等于5又分3种情况：
                //等于5 等于4  其他（1 2 3）
                switch (a) {
                    case 5:
                        result.append(te[base]);
                        break;
                    case 4:
                        result.append(te[base]).append(te[base - 1]);
                        break;
                    default:
                        for (int i = 0; i < a; ++i) {
                            result.append(te[base - 1]);
                        }
                        break;
                }
            } else {
                //余数大于5又分2种情况：
                //等于9 其他（6 7 8）
                switch (a) {
                    case 9:
                        result.append(te[base + 1]).append(te[base - 1]);
                        break;
                    default:
                        int t = a - 5;
                        for (int i = 0; i < t; ++i) {
                            result.append(te[base - 1]);
                        }
                        result.append(te[base]);
                        break;
                }
            }
            num = num / 10;
            temp++;
        }
        return result.reverse().toString();
    }

