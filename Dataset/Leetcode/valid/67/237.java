 class Solution {
    public String XXX(String a, String b) {
        char[] chars = new char[ Math.max(a.length(), b.length()) + 1];
        int alen = a.length()-1;
        int blen = b.length()-1;
        boolean flag = false;
        int index = chars.length-1;
        for (; alen>=0 && blen>=0; alen--,blen--) {
            if (a.charAt(alen) == '1' && b.charAt(blen) == '1'){
                if (flag){
                    chars[index--] = '1';
                }else{
                    chars[index--] = '0';
                    flag = true;
                }
            }else if(a.charAt(alen) == '0' && b.charAt(blen) == '0'){
                if (flag){
                    chars[index--] = '1';
                    flag = !flag;
                }else {
                    chars[index--] = '0';
                }
            }else{
                if (flag){
                    chars[index--] = '0';
                }else {
                    chars[index--] = '1';
                }
            }
        }
        for (;alen>=0;alen--){
            if (a.charAt(alen) == '1'){
                if (flag){
                    chars[index--] = '0';
                }else {
                    chars[index--] = '1';
                }
            }else {
                if (flag){
                    chars[index--] = '1';
                    flag = !flag;
                }else {
                    chars[index--] = '0';
                }
            }
        }
        for (;blen>=0;blen--){
            if (b.charAt(blen) == '1'){
                if (flag){
                    chars[index--] = '0';
                }else {
                    chars[index--] = '1';
                }
            }else {
                if (flag){
                    chars[index--] = '1';
                    flag = !flag;
                }else {
                    chars[index--] = '0';
                }
            }
        }
        if (flag){
            chars[index--] = '1';
        }
        return new String(chars,++index,chars.length-index);
    }
}

