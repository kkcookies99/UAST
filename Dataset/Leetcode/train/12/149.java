 class Solution {
    public String XXX(int num) {
        String res = "";
        while(num > 0) {
            if (num / 1000 > 0) {
                for (int i = 0; i < num / 1000; i++) {
                    res += "M";
                }
                num = num - (num / 1000) * 1000;
            } else if (num / 900 > 0) {
                for (int i = 0; i < num / 900; i++) {
                    res += "CM";
                }
                num = num - (num / 900) * 900;
            } else if (num / 500 > 0) {
                for (int i = 0; i < num / 500; i++) {
                    res += "D";
                }
                num = num - (num / 500) * 500;
            } else if (num / 400 > 0) {
                for (int i = 0; i < num / 400; i++) {
                    res += "CD";
                }
                num = num - (num / 400) * 400;
            } else if (num / 100 > 0) {
                for (int i = 0; i < num / 100; i++) {
                    res += "C";
                }
                num = num - (num / 100) * 100;
            } else if (num / 90 > 0) {
                for (int i = 0; i < num / 90; i++) {
                    res += "XC";
                }
                num = num - (num / 90) * 90;
            } else if (num / 50 > 0) {
                for (int i = 0; i < num / 50; i++) {
                    res += "L";
                }
                num = num - (num / 50) * 50;
            } else if (num / 40 > 0) {
                for (int i = 0; i < num / 40; i++) {
                    res += "XL";
                }
                num = num - (num / 40) * 40;
            } else if (num / 10 > 0) {
                for (int i = 0; i < num / 10; i++) {
                    res += "X";
                }
                num = num - (num / 10) * 10;
            } else if (num / 9 > 0) {
                for (int i = 0; i < num / 9; i++) {
                    res += "IX";
                }
                num = num - (num / 9) * 9;
            } else if (num / 5 > 0) {
                for (int i = 0; i < num / 5; i++) {
                    res += "V";
                }
                num = num - (num / 5) * 5;
            } else if (num / 4 > 0) {
                for (int i = 0; i < num / 4; i++) {
                    res += "IV";
                }
                num = num - (num / 4) * 4;
            } else {
                for (int i = 0; i < num; i++) {
                    res += "I";
                }
                break;
            }
        }
        return res;
    }
}

