class Solution {
    public String XXX(String a, String b) {
        int aLen = a.length() - 1, bLen = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (aLen >= 0 || bLen >= 0 || carry != 0) {
            int curA = aLen >= 0 ? a.charAt(aLen) - '0' : 0;
            int curB = bLen >= 0 ? b.charAt(bLen) - '0' : 0;
            int tmp = curA + curB + carry;
            carry = tmp / 2;
            result.append(tmp % 2);
            aLen--; bLen--;
        }

        return result.reverse().toString();
    }
}

