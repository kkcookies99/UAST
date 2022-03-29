 public int XXX(String s) {
 char[] chars = s.toCharArray();
        boolean xxx = false;
        int count = 0;
        long number = 0;
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                if (xxx){
                    break;
                }
                continue;
            }else if (chars[i] == '-'){
                if (xxx){
                    break;
                }
                xxx = true;
                if (count==1) return 0;
                    count++;
                flag = true;
            }else if (chars[i] == '+'){
                if (xxx){
                    break;
                }
                xxx = true;
                if (count==1) return 0;
                count++;
                flag = false;
            }else if (chars[i] <48 || chars[i] > 57){
                break;
            }else {
                if (chars[i]>=48 && chars[i]<=57){
                    xxx = true;
                    number = number*10 + Integer.valueOf(String.valueOf(chars[i]));
                    if (number>Integer.MAX_VALUE ){
                        if (flag){
                            return Integer.MIN_VALUE;
                        }else {
                            return Integer.MAX_VALUE;
                        }
                    }
                }
            }
        }
        if (flag){
            return (int) (0-number);
        }
        return (int) number;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

