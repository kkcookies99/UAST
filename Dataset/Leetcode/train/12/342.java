 class Solution {
    public String XXX(int num) {
        StringBuilder builder = new StringBuilder();
        while(true){
            num = handler(builder,num);
            if(num == 0){
                break;
            }
        }
        return builder.toString();
    }

    public static int handler(StringBuilder builder,int num){
        if(num >=1000){
            builder.append("M");
            return num - 1000;
        }else if(num >=900){
            builder.append("CM");
            return num - 900;
        }else if(num >=500){
            builder.append("D");
            return num - 500;
        }else if(num >=400){
            builder.append("CD");
            return num - 400;
        }else if(num >=100){
            builder.append("C");
            return num - 100;
        }else if(num >=90){
            builder.append("XC");
            return num - 90;
        }else if(num >=50){
            builder.append("L");
            return num - 50;
        }else if(num >=40){
            builder.append("XL");
            return num - 40;
        }else if(num >=10){
            builder.append("X");
            return num - 10;
        }else if(num >=9){
            builder.append("IX");
            return num - 9;
        }else if(num >=5){
            builder.append("V");
            return num - 5;
        }else if(num >=4){
            builder.append("IV");
            return num - 4;
        }else if(num >=1){
            builder.append("I");
            return num - 1;
        }
        return 0;
    }
}

