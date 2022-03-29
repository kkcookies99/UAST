 public String XXX(String a, String b) {
        int p = Integer.parseInt(a, 2);
        int q = Integer.parseInt(b, 2);
        int sum = p ^ q;
        int carry = (p & q) << 1;
        while (carry != 0) {
            p = sum;
            q = carry;
            sum = p ^ q;
            carry = (p & q) << 1;
        }
        return Integer.toBinaryString(sum);
    }

