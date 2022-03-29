class Solution {
    public String XXX(String a, String b) {
        StringBuffer s1 = new StringBuffer(a).reverse();
        StringBuffer s2 = new StringBuffer(b).reverse();
        StringBuffer res = new StringBuffer();
        
        int i = 0, j = 0, carry = 0;
        while (i < s1.length() || j < s2.length() || carry != 0){
            int val1 = i >= s1.length() ? 0 : s1.charAt(i++) - '0';
            int val2 = j >= s2.length() ? 0 : s2.charAt(j++) - '0';
            res.append((val1 + val2 + carry) % 2);
            carry = (val1 + val2 + carry) / 2;
        }
        return res.reverse().toString();
    }
}

