class Solution {
    public String XXX(String a, String b) {
        byte carry = 0;
        int indexA = a.length();
        int indexB = b.length();
        StringBuilder sb = new StringBuilder();
        while (indexA > 0 || indexB > 0) {
            if (indexA > 0 && a.charAt(--indexA) == '1') {
                carry++;
            }
            if (indexB > 0 && b.charAt(--indexB) == '1') {
                carry++;
            }
            sb.append(carry == 0 || carry == 2 ? '0' : '1');
            carry = (byte) (carry > 1 ? 1 : 0);
        }
        if (carry > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}

