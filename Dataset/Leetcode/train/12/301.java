 public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0){
            if (num >= 1000){
                sb.append("M");
                num -= 1000;
                continue;
            }
            if (num >= 900){
                sb.append("CM");
                num -= 900;
                continue;
            }
            if (num >= 500){
                sb.append("D");
                num -= 500;
                continue;
            }
            if (num >= 400){
                sb.append("CD");
                num -= 400;
                continue;
            }
            if (num >= 100){
                sb.append("C");
                num -= 100;
                continue;
            }
            if (num >= 90){
                sb.append("XC");
                num -= 90;
                continue;
            }
            if (num >= 50){
                sb.append("L");
                num -= 50;
                continue;
            }
            if (num >= 40){
                sb.append("XL");
                num -= 40;
                continue;
            }
            if (num >= 10){
                sb.append("X");
                num -= 10;
                continue;
            }
            if (num >= 9){
                sb.append("IX");
                num -= 9;
                continue;
            }
            if (num >= 5){
                sb.append("V");
                num -= 5;
                continue;
            }
            if (num >= 4){
                sb.append("IV");
                num -= 4;
                continue;
            }
            if (num >= 1){
                sb.append("I");
                num --;
                continue;
            }
        }
        return sb.toString();
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


