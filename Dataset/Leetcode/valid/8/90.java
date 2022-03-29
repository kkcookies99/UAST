class Solution {
    public int XXX(String s) {
        s = s.trim();
        int res = 0, n = s.length();
        int sign = 1;   // 0负1正
        StringBuilder sb = new StringBuilder();
        // int base = 1;
        boolean neg = s.startsWith("-");
        boolean pos = s.startsWith("+");
        if ( neg ) {
            sign = 0;
            s = s.substring(1);
        } else if ( pos ) {
            sign = 1;
            s = s.substring(1);            
        }

        char[] ss = s.toCharArray();
        for ( int i = 0; i < ss.length; i++) {
            // if ( ss[i] == ' ' ) {
            //     continue;
            // }
            if ( isNumber(ss[i]) ) {
                // res += base * (ss[i]-'0');
                sb.append(ss[i]);
                // base *= 10;
            } else {
                break;
            }
        }
        if ( sb.toString().equals("") ) {
            return res;
        }
        try {
            res = sign == 1 ? Integer.parseInt(sb.toString()) : -Integer.parseInt(sb.toString());
        } catch (Exception e) {
            if ( sign == 0 ) {
                res = Integer.MIN_VALUE;
            } else {
                res = Integer.MAX_VALUE;
            }
        }
        return res;
    }
    boolean isNumber(char ch) {
        return ch-'0' >= 0 && ch-'0' <= 9;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

