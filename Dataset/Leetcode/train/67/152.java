 class Solution {
    public String XXX(String a, String b) {
        if(a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        char[] cs = new char[a.length() + 1];
        int carry = 0;
        for(int i = 0; i<= a.length(); i++) {
            char ac = i < a.length() ? a.charAt(a.length() - 1 - i) : '0';
            char bc = i < b.length() ? b.charAt(b.length() - 1 - i) : '0';
            int sum = ac + bc + carry - '0' * 2;
            cs[cs.length - 1 - i] = (char)(sum % 2 + '0');
            carry = sum / 2;
        }
        return cs[0] != '0' ? new String(cs) : new String(cs, 1, cs.length - 1);
    }
}
