class Solution {
    public String XXX(String a, String b) {
        StringBuffer res = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) { // ||
            int n1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int tem = n1 + n2 + carry;
            carry = (tem >= 2) ? 1 : 0;
            res.append(tem % 2);
            i--;
            j--;
        }
        if (carry != 0) res.append(carry);
        return new String(res.reverse());
    }
}

