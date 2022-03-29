 class Solution {
    public String XXX(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int counta = a.length() - 1;
        int countb = b.length() - 1;
        int number = Math.max(counta,countb);
        int flag = 0;
        if(counta > countb){
            for(int i = 0; i < counta - countb;i++){
                b = "0" + b;
            }
        }else{
            for(int i = 0; i < countb - counta;i++){
                a = "0" + a;
            }
        }
        while(number >= 0){
            if(a.charAt(number) == '1' && b.charAt(number) == '1'){
                if(flag == 1){
                    sb.append("1");
                }else{
                    sb.append("0");
                }
                flag = 1;
            }
            else if(a.charAt(number) == '0' && b.charAt(number) == '0'){
                if(flag == 1){
                    sb.append("1");
                }else{
                    sb.append("0");
                }
                flag = 0;
            }else{
                if(flag == 1){
                    sb.append("0");
                    flag = 1;
                }else{
                    sb.append("1");
                    flag = 0;
                }
            }
            number--;
        }
        if(flag == 1){
                sb.append("1");
        }
        return sb.reverse().toString();
    }
}

