class Solution {
    public int XXX(String s) {
        String st = s.trim();
        if(st.isEmpty()) return 0;
        int sign = 1,i = 0;
        long ans = 0;
        if (st.charAt(0) == '+' || st.charAt(0) == '-') {
            sign = st.charAt(0) == '+' ? 1 : -1;
            i++;
        }
        while (i<st.length()&&Character.isDigit(st.charAt(i))) {
            ans =  ans * 10 + st.charAt(i)-'0';
            ans = sign==1? Math.min(ans,(long)Integer.MAX_VALUE):Math.min(ans,-(long)Integer.MIN_VALUE);
            i++;
        }
        return sign * (int)ans;
    }
}

