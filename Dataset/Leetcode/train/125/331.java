 class Solution {
    public boolean XXX(String s) {
        StringBuilder a = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <='9') {
                a.append(c[i]);
            }
        }
        int len = a.length();
        String begin = a.substring(0,len/2);
        StringBuilder last = new StringBuilder();
        if(len%2 == 1) {
            last.append(a.substring(len/2+1, len));
        }else {
            last.append(a.substring(len/2, len));
        }
        last.reverse();
        String last1 = last.toString();
        return begin.equalsIgnoreCase(last1);
    }
}

