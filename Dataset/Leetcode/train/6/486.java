 public String XXX(String s, int numRows) {
   StringBuffer c=new StringBuffer();
    int d=0,e=0;
    char[] b = s.toCharArray();
    if(numRows==1)
        return s;
    else {
        for (int i = 1; i <= numRows; i++) {
            d = i - 1;
            e = (numRows - i) * 2;
            while (d < s.length()) {
                c = c .append(b[d]);
                d = d + e;
                e = (numRows - 1) * 2 - e;
                if (e == (numRows - 1) * 2)
                    d = d + (numRows - 1) * 2;
            }
        }
        return c.toString();
    }
}

