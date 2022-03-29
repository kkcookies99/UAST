 class Solution {
    public String XXX(int num) {
        StringBuilder res = new StringBuilder();
        while(num != 0){
            int tmp = 0;
            int divide = 0;
            if(num >= 1000){
                divide = 1000;
            }else if(num >= 900){
                divide = 900;
            }else if(num >= 500){
                divide = 500;
            }else if(num >= 400){
                divide = 400;
            }else if(num >= 100){
                divide = 100;
            }else if(num >= 90){
                divide = 90;
            }else if(num >= 50){
                divide = 50;
            }else if(num >= 40){
                divide = 40;
            }else if(num >= 10){
                divide = 10;
            }else if(num >= 9){
                divide = 9;
            }else if(num >= 5){
                divide = 5;
            }else if(num >= 4){
                divide = 4;
            }else if(num >= 1){
                divide = 1;
            }
            tmp = num / divide;
            num %= divide;
            for(int i = 0; i < tmp; i++){
                res.append(getStr(divide));
            }
        }
        return res.toString();
    }
    private String getStr(int num){
        switch(num){
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            case 4: return "IV";
            case 9: return "IX";
            case 40: return "XL";
            case 90: return "XC";
            case 400: return "CD";
            case 900: return "CM";
        }
        return "";
    }
}

