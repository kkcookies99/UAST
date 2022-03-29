 class Solution {
    public String XXX(int num) {
        String res = "";
        int p = 0;
        int n = 0;
        String k = "";
        while(num > 1){
            k = String.valueOf(num);
            p = (k.charAt(0)-'0')*(int)Math.pow(10,k.length()-1);
            if(p == 4){
                res += "IV";
                num -= 4;
            }else if(p == 9){
                res += "IX";
                num -= 9;
            }else if(p == 40){
                res += "XL";
                num -= 40;
            }else if(p == 90){
                res += "XC";
                num -= 90;
            }else if(p == 400){
                res += "CD";
                num -= 400;
            }else if(p == 900){
                res += "CM";
                num -= 900;
            }else{
                if(num >= 1000){
                    n = 1000;
                    k = "M";
                }else if(num >= 500){
                    n = 500;
                    k = "D";
                }else if(num >= 100){
                    n = 100;
                    k = "C";
                }else if(num >= 50){
                    n = 50;
                    k = "L";
                }else if(num >= 10){
                    n = 10;
                    k = "X";
                }else if(num >= 5){
                    n = 5;
                    k = "V";
                }else {
                    n = 1;
                    k = "I";
                }
                for(int i = 0; i < num/n; i++){
                    res += k;
                }
                num = num%n;
            }
        }
        if(num == 1){
            res += "I";
        }
        return res;
    }
}

