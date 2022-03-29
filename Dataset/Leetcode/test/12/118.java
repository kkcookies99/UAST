 class Solution {
        private StringBuilder sb = new StringBuilder();
        public String XXX(int num) {
            int temp;
            if((temp = num / 1000) > 0){
                sb.append(String.join("", Collections.nCopies(temp,"M")));
                num = num - temp * 1000;
                return XXX(num);
            }else if ((temp = num / 100) > 0){
                if (temp == 9){
                    sb.append("CM");
                }else if(temp >= 5){
                    sb.append("D");
                    sb.append(String.join("", Collections.nCopies(temp-5,"C")));
                }else if (temp == 4){
                    sb.append("CD");
                }else {
                    sb.append(String.join("", Collections.nCopies(temp,"C")));
                }
                num = num - temp * 100;
                return XXX(num);
            }else if ((temp = num / 10) > 0){
                if (temp == 9){
                    sb.append("XC");
                }else if (temp >= 5){
                    sb.append("L");
                    sb.append(String.join("", Collections.nCopies(temp-5,"X")));
                }else if (temp == 4){
                    sb.append("XL");
                }else {
                    sb.append(String.join("", Collections.nCopies(temp,"X")));
                }
                num = num - temp * 10;
                return XXX(num);
            }else {
                if (num == 0){

                }else if (num == 9){
                    sb.append("IX");
                }else if (num >= 5){
                    sb.append("V");
                    sb.append(String.join("", Collections.nCopies(num-5,"I")));
                }else if (num == 4){
                    sb.append("IV");
                }else {
                    sb.append(String.join("", Collections.nCopies(num,"I")));
                }
                return sb.toString();
            }
        }
    }```

