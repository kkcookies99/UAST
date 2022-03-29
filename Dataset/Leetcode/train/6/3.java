 public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuffer[] sbs = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuffer();
        }
        int flag = 1;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            sbs[n].append(s.charAt(i));
            if(n == 0 || n == numRows - 1)
                flag = flag == 0 ? 1 : 0;
            if(flag == 0) {
                n++;
            }
            else n --;

        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            sb.append(sbs[i].toString());
        }
        return sb.toString();
    }

