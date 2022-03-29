 class Solution {
    public String XXX(int num) {
        StringBuilder ans = new StringBuilder("");
        while (num>0){
            if (num>=1000){
                ans.append("M");
                num -= 1000;
            }else if (num>=900){
                ans.append("CM");
                num -= 900;
            }else if (num>=500){
                ans.append("D");
                num -= 500;
            }else if (num>=400){
                ans.append("CD");
                num -= 400;
            }else if (num>=100){
                ans.append("C");
                num -= 100;
            }else if (num>=90){
                ans.append("XC");
                num -= 90;
            }else if (num>=50){
                ans.append("L");
                num -= 50;
            }else if (num>=40){
                ans.append("XL");
                num -= 40;
            }else if (num>=10){
                ans.append("X");
                num -= 10;
            }else if (num>=9){
                ans.append("IX");
                num -= 9;
            }else if (num>=5){
                ans.append("V");
                num -= 5;
            }else if (num>=4){
                ans.append("IV");
                num -= 4;
            }else if (num>=1){
                ans.append("I");
                --num;
            }
        }
        return ans.toString();
    }
}

