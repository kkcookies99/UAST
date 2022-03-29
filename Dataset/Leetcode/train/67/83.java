 class Solution {
    public String XXX(String a, String b) {
        StringBuffer res = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (b.charAt(j) - '0');
                j--;
            }
            res.append(sum % 2);
            carry = sum / 2;  
        }
        return res.reverse().toString();
    }
}

