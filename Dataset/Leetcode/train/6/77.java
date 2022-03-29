 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1 || "".equals(s)) return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }
        int span = 0;
        boolean up = false;
        for (int i = 0; i < s.length(); i++) {
            sbs[span].append(s.charAt(i));
            if(span == 0) up = false;
            if(span == numRows -1) up = true;
            if(up) span --;
            if(!up) span ++;
        }
        int i = numRows -1;
        while ( i - 1 >= 0) {
            sbs[i-1] = sbs[i-1].append(sbs[i]);
            i --;
        }
        return sbs[0].toString();
    }
}

