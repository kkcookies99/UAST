 class Solution {
    public String XXX(int num) {
        String roma = "";
        while(num / 1000 > 0){
            roma += "M";
            num -= 1000;
        }
        while(num / 900 > 0){
            roma += "CM";
            num -= 900;
        }
        while(num / 500 > 0){
            roma += "D";
            num -= 500;
        }
        while(num / 400 > 0){
            roma += "CD";
            num -= 400;
        }
        while(num / 100 > 0){
            roma += "C";
            num -= 100;
        }
        while(num / 90 > 0){
            roma += "XC";
            num -= 90;
        }
        while(num / 50 > 0){
            roma += "L";
            num -= 50;
        }
        while(num / 40 > 0){
            roma += "XL";
            num -= 40;
        }
        while(num / 10 > 0){
            roma += "X";
            num -= 10;
        }
        while(num / 9 > 0){
            roma += "IX";
            num -= 9;
        }
        while(num / 5 > 0){
            roma += "V";
            num -= 5;
        }
        while(num / 4 > 0){
            roma += "IV";
            num -= 4;
        }
        while(num / 1 > 0){
            roma += "I";
            num -= 1;
        }

        return roma;
    }
}

