 class Solution {
    public String XXX(String a, String b) {
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        int lena = cha.length;
        int lenb = chb.length;
        if (lena > lenb) {
            return calc(cha, chb);
        } else {
            return calc(chb, cha);
        }
    }

    private String calc(char[] big, char[] small1) {
        StringBuffer sb = new StringBuffer();
        boolean jinwei = false;
        char[] small = new char[big.length];
        for (int i = 0; i < big.length - small1.length; i++) {
            small[i] = '0';
        }
        for (int i = big.length - small1.length; i < big.length; i++) {
            small[i] = small1[i - big.length + small1.length];
        }
        for (int i = small.length - 1; i >= 0; i--) {
            if (small[i] == '0' && big[i] == '0' && jinwei) {
                sb.insert(0, "1");
                jinwei = false;
            } else if (small[i] == '0' && big[i] == '0' && !jinwei) {
                sb.insert(0, "0");
            } else if (small[i] == '1' && big[i] == '1' && jinwei) {
                sb.insert(0, "1");
            } else if (small[i] == '1' && big[i] == '1' && !jinwei) {
                sb.insert(0, "0");
                jinwei = true;
            } else if (((small[i] == '1' && big[i] == '0') || (small[i] == '0' && big[i] == '1')) && jinwei) {
                sb.insert(0, "0");
            } else if (((small[i] == '1' && big[i] == '0') || (small[i] == '0' && big[i] == '1')) && !jinwei) {
                sb.insert(0, "1");
            }
        }
        if (jinwei) {
            sb.insert(0, "1");
        }
        return String.valueOf(sb);
    }
}

