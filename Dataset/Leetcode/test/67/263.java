  public String XXX(String a, String b) {
        int carry = 0;
        int aLength = a.length();
        int bLength = b.length();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int max = Math.max(aLength, bLength);
        char result[] = new char[max];
        for (int i = 0; i < max; i++) {
            int tmp = carry + (i < aLength ? (aChar[aLength - 1 - i] == '0'?0:1): 0 )+ (i < bLength ? (bChar[bLength - 1 - i] == '0'?0:1) : 0);
            result[max - i - 1] = tmp % 2 == 0 ?'0':'1';
            carry = tmp / 2;
        }
        return (carry != 0 ? "1" : "" )+ new String(result);
    }

