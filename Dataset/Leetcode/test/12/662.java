 class Solution {
    public String XXX(int num) {
        StringBuffer sb = new StringBuffer();
        if(num >= 1000){
            for(int i = 0 ; i < num /1000 ;i++){
                sb.append('M');
            }
            num = num % 1000;
        }
        if(num >= 100){
            if(num >= 900){
                sb.append("CM");
            }else if(num >= 500){
                sb.append('D');
                for(int i = 0 ; i < (num / 100 -5) ; i++){
                    sb.append('C');
                }
            }else if(num >= 400){
                sb.append("CD");
            }else{
                for(int i = 0 ; i < num / 100 ; i++){
                    sb.append("C");
                }
            }
            num = num % 100;
        }
        if(num >= 10){
            if(num >= 90){
                sb.append("XC");
            }else if(num >= 50){
                sb.append('L');
                for(int i = 0 ; i < (num / 10 -5) ; i++){
                    sb.append('X');
                }
            }else if(num >= 40){
                sb.append("XL");
            }else{
                for(int i = 0 ; i < num / 10 ; i++){
                    sb.append("X");
                }
            }
            num = num % 10;
        }
        if(num >= 1){
            if(num == 9){
                sb.append("IX");
            }else if(num >= 5){
                sb.append('V');
                for(int i = 0 ; i < (num / 1 -5) ; i++){
                    sb.append('I');
                }
            }else if(num == 4){
                sb.append("IV");
            }else{
                for(int i = 0 ; i < num / 1 ; i++){
                    sb.append("I");
                }
            }
        }
        return String.valueOf(sb);
    }
}

