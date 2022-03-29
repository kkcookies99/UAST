  public String XXX(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (aLen >= 0 || bLen >= 0) {
            int as = aLen >= 0 && a.charAt(aLen--) == '1' ? 1 : 0;
            int bs = bLen >= 0 && b.charAt(bLen--) == '1' ? 1 : 0;
            sum = as + bs + carry;
            sb.append(sum & 1);
            carry = sum >> 1;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

