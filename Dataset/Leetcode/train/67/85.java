     public String XXX(String a, String b) {
        char[] chsa = a.toCharArray();
        char[] chsb = b.toCharArray();
        int i = chsa.length - 1;
        int j = chsb.length - 1;
        int carry = 0;
        int tmp;
        StringBuilder builder = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int inta = i < 0 ? 0 : chsa[i] - '0';
            int intb = j < 0 ? 0 : chsb[j] - '0';
            tmp = (inta + intb + carry) % 2;
            carry = (inta + intb + carry) / 2;
            builder.insert(0, tmp);
            i--;
            j--;
        }
        if (carry == 1) {
            builder.insert(0, carry);
        }

        return builder.toString();
    }

