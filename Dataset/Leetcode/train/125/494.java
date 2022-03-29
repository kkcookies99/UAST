 public boolean XXX(String s) {
        if (s.length() == 0) return true;

        int i = 0, j = s.length() - 1;
        int cntE = 0, cnt = 0;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            while (!isLegal(ci) && i<j) {
                ci = s.charAt(++i);
            }
            while (!isLegal(cj) && j>i) {
                cj = s.charAt(--j);
            }
            cnt++;
            if ((ci & 0xDF) == (cj & 0xDF)) {
                i++;
                j--;
                cntE++;
            }else {
                return false;
            }
        }

        return cntE!= 0 && cntE == cnt;
    }

    public boolean isLegal(char c) {
        if ((c >= '0' && c <= '9')
                || (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
        ){
            return true;
        }
        return false;
    }

