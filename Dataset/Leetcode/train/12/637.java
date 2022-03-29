 public String XXX(int num) {
        if (num == 4) {
            return "IV";
        }
        if (num == 9) {
            return "IX";
        }
        if (num == 40) {
            return "XL";
        }
        if (num == 90) {
            return "XC";
        }
        if (num == 400) {
            return "CD";
        }
        if (num == 900) {
            return "CM";
        }
        int[] constant = {1000, 500, 100, 50, 10, 5, 1};
        char[] consta***oman = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        String[] spConsta***oman = {"*", "CM", "CD", "XC", "XL", "IX", "IV"};
        int[] spConstant = {5000, 900, 400, 90, 40, 9, 4};
        StringBuilder rst = new StringBuilder();
        for (int i = 0; i < constant.length; i++) {
            if (i < spConstant.length && num >= spConstant[i]) {
                rst.append(spConsta***oman[i]);
                num -= spConstant[i];
            } else {
                while (num - constant[i] >= 0) {
                    rst.append(consta***oman[i]);
                    num -= constant[i];
                }
            }

            if (num == 0) {
                break;
            }
        }
        return rst.toString();
    }

