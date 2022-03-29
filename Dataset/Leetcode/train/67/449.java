class Solution {
    public String XXX(String a, String b) {
        char[] ac = a.toCharArray(), bc = b.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        int a1 = ac.length - 1, b1 = bc.length - 1, t = 0;
        while (a1 > -1 || b1 > -1 || t != 0) {
            if (a1 > -1 && ac[a1--] == '1') t += 1; 
            if (b1 > -1 && bc[b1--] == '1') t += 1;
            sb.append(t & 1); 
            t >>= 1;
        }
        return sb.reverse().toString();
    }
}

