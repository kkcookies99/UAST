 class Solution {
    public String XXX(int num) {
        String romeNum = "";
        while(num > 0) {
            if(num >= 1000) {
                romeNum += "M";
                num -= 1000;
            }else if(num >= 900) {
                romeNum += "CM";
                num -= 900;
            }else if(num >= 500) {
                romeNum += "D";
                num -= 500;
            }else if(num >= 400) {
                romeNum += "CD";
                num -= 400;
            }else if(num >= 100) {
                romeNum += "C";
                num -= 100;
            }else if(num >= 90) {
                romeNum += "XC";
                num -= 90;
            }else if(num >= 50) {
                romeNum += "L";
                num -= 50;
            }else if(num >= 40) {
                romeNum += "XL";
                num -= 40;
            }else if(num >= 10) {
                romeNum += "X";
                num -= 10;
            }else if(num >= 9) {
                romeNum += "IX";
                num -= 9;
            }else if(num >= 5) {
                romeNum += "V";
                num -= 5;
            }else if(num >= 4) {
                romeNum += "IV";
                num -= 4;
            }else if(num == 3) {
                romeNum += "III";
                num = 0;
            }else if(num == 2) {
                romeNum += "II";
                num = 0;
            }else if(num == 1) {
                romeNum += "I";
                num = 0;
            }
        }
        return romeNum;
    }
}

