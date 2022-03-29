 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String pre = XXX(n-1);
        Character fir = null;
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<pre.length(); i++) {
            if (fir == null) fir = pre.charAt(i);
            if (pre.charAt(i) == fir) {
                count++;
            } else {
                sb.append(count+""+fir);
                fir=pre.charAt(i);
                count=1;
            }
        }
        sb.append(count+""+fir);
        return sb.toString();
    }
}

