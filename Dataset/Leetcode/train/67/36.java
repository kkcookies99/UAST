 class Solution {
    public String XXX(String a, String b) {
        int len = Math.max(a.length(),b.length());
        //将两个字符串转换为等长的
        char[] s1 = new char[len];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = '0';
        }
        char[] s2 = new char[len];
        for (int i = 0; i < s2.length; i++) {
            s2[i] = '0';
        }
        char[] s3 = new char[len + 1];
        for (int i = 0; i < s3.length; i++) {
            s3[i] = '0';
        }
        int j = s1.length - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            s1[j] = a.charAt(i);
            j--;
        }
        j = s2.length - 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            s2[j] = b.charAt(i);
            j--;
        }
        int i = s1.length - 1;
        boolean flag = false;//是否进位的标志器
        while(i >= 0){
            if(s1[i] == '0' && s2[i] == '0'){
                if(flag){
                    s3[i + 1] = '1';
                }
                else {
                    s3[i + 1] = '0';
                }
                flag = false;//两个0怎么加都不会有进位
            }
            else if(s1[i] == '0' && s2[i] == '1'){
                if(flag){//根据情况判断是否有进位
                    s3[i + 1] = '0';
                    flag = true;
                }
                else {
                    s3[i + 1] = '1';
                    flag = false;
                }
            }
            else if(s1[i] == '1' && s2[i] == '0'){
                if(flag){
                    s3[i + 1] = '0';
                    flag = true;
                }
                else {
                    s3[i + 1] = '1';
                    flag = false;
                }
            }
            else{
                if(flag){
                    s3[i + 1] = '1';
                }
                else{
                    s3[i + 1] = '0';
                }
                flag = true;//两个1相加本来自带进位
            }
            i--;
        }
        if(!flag){
            char[] ret = new char[len];
            for (int k = 0; k < ret.length; k++) {
                ret[k] = s3[k + 1];
            }
            return new String(ret);
        }
        s3[0] = '1';
        return new String(s3);
    }
}

