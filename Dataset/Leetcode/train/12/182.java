 class Solution {
    public String XXX(int num) {
        if(num <= 0){
            return null;
        }
        StringBuilder res = new StringBuilder();
        while(num > 0){
            if(num >= 1000){
                res.append("M");
                num = num - 1000;
            } else if (num >= 900) {
                res.append("CM");
                num = num - 900;
            } else if (num >= 500){
                res.append("D");   
                num = num - 500;
            } else if (num >= 400){
                res.append("CD");
                num = num - 400;
            } else if (num >= 100){
                res.append("C");
                num = num - 100;
            } else if (num >= 90){
                res.append("XC");
                num = num - 90;
            } else if (num >= 50){
                res.append("L");
                num = num - 50;
            } else if (num >= 40){
                res.append("XL");
                num = num - 40;
            } else if (num >= 10){
                res.append("X");
                num = num -10;
            } else if (num >= 9){
                res.append("IX");
                num = num - 9;
            } else if (num >= 5){
                res.append("V");
                num = num - 5;
            } else if (num >= 4){
                res.append("IV");
                num = num - 4;
            } else {
                res.append("I");
                num = num - 1;
            }
        }
        return res.toString();
    }
}

