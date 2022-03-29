 class Solution {
    public String XXX(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int len = Math.max(len1, len2);
        String ret = "";
        boolean plus = false;
        for(int i = 0; i < len; i++) {
            char ch1 = (len1 > 0 ? a.charAt(len1 - 1) : ' ');
            char ch2 = (len2 > 0 ? b.charAt(len2 - 1) : ' ');

            int num1 = ch1 == '1' ? 1 : 0;
            int num2 = ch2 == '1' ? 1 : 0;
            int res = num1 + num2;
            if (res == 2) {
                if (plus) {
                    ret = '1' + ret;
                } else {
                    ret = '0' + ret;
                }
                plus = true;
            } else if (res == 1) {
                if (plus) {
                    ret = '0' + ret;
                    plus = true;
                } else {
                    ret = '1' + ret;
                    plus = false;
                }
            } else {
                if (plus) {
                    ret = '1' + ret;
                } else {
                    ret = '0' + ret;
                }
                plus = false;
            }
            len1--;
            len2--;
        }
        if (plus) {
            ret = '1' + ret;
        }
        
        return ret;
    }
}

