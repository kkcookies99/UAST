 class Solution {
    public String XXX(int num) {
        StringBuilder result = new StringBuilder();
        while (num >= 1000) {
            result.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            result.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            result.append("D");
            num -= 500;
        }
        while (num >= 400) {
            result.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            result.append("C");
            num -= 100;
        }
        while (num >= 90) {
            result.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            result.append("L");
            num -= 50;
        }
        while (num >= 40) {
            result.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            result.append("X");
            num -= 10;
        }
        while (num >= 9) {
            result.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            result.append("V");
            num -= 5;
        }
        while (num >= 4) {
            result.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            result.append("I");
            num -= 1;
        }
        return result.toString();
    }
}

