     public String XXX(int num) {
        StringBuilder sb=new StringBuilder();
        if(num >= 1000){
            for (int i = 0; i < num/1000; i++) {
                sb.append("M");
            }
            return sb.append(XXX(num-(num/1000)*1000)).toString();
        }else if(num >= 500){
            //大于900 ，CM
            if(num >= 900){
                sb.append("CM");
                return sb.append(XXX(num%900)).toString();
            }else {
                //大于500 小于900
                sb.append("D");
                for (int i = 0; i < (num-500)/100; i++) {
                    sb.append("C");
                }
                return sb.append(XXX(num%100)).toString();
            }
        }else if(num >= 100){
            if(num >= 400){
                sb.append("CD");
                return sb.append(XXX(num%400)).toString();
            }else {
                for (int i = 0; i < num/100; i++) {
                    sb.append("C");
                }
                return sb.append(XXX(num%100)).toString();
            }
        }else if(num >= 50){
            if(num >= 90){
                sb.append("XC");
                return sb.append(XXX(num%90)).toString();
            }else {
                sb.append("L");
                for (int i = 0; i < (num-50)/10; i++) {
                    sb.append("X");
                }
                return sb.append(XXX(num%10)).toString();
            }
        }else if(num >= 10){
            if(num >= 40){
                sb.append("XL");
                return sb.append(XXX(num%40)).toString();
            }else {
                for (int i = 0; i < num/10; i++) {
                    sb.append("X");
                }
                return sb.append(XXX(num%10)).toString();
            }
        }else if(num >= 5){
            if(num == 9){
                return sb.append("IX").toString();
            }else{
                sb.append("V");
                for (int i = 0; i < (num-5); i++) {
                    sb.append("I");
                }
                return sb.toString();
            }
        }else{
            if(num == 4){
                return sb.append("IV").toString();
            }else{
                for (int i = 0; i < num; i++) {
                    sb.append("I");
                }
                return sb.toString();
            }
        }
    }

