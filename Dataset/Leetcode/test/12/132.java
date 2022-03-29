 class Solution {
    public String XXX(int num) {
        StringBuilder sBuilder = new StringBuilder();
        while(num>0){
            if(num>=1000){
                sBuilder.append("M");
                num -= 1000;
            }else if(num>=900){
                sBuilder.append("CM");
                num -= 900;
            }else if(num >=500){
                sBuilder.append("D");
                num-=500;
            }else if(num>=400){
                sBuilder.append("CD");
                num-=400;
            }else if(num>=100){
                sBuilder.append("C");
                num-=100;
            }else if(num>=90){
                sBuilder.append("XC");
                num-=90;
            }else if(num>=50){
                sBuilder.append("L");
                num-=50;
            }else if(num>=40){
                sBuilder.append("XL");
                num-=40;
            }else if(num>=10){
                sBuilder.append("X");
                num-=10;
            }else if(num>=9){
                sBuilder.append("IX");
                num-=9;
            }else if(num>=5){
                sBuilder.append("V");
                num-=5;
            }else if(num>=4){
                sBuilder.append("IV");
                num-=4;
            }else {
                sBuilder.append("I");
                num-=1;
            }
        }
        return sBuilder.toString();
    }
}

