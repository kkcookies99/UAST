 class Solution {
    public String XXX(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while(ia >= 0 || ib >= 0 || carry > 0){
            carry += (ia >= 0) ? a.charAt(ia--) - '0' : 0;
            carry += (ib >= 0) ? b.charAt(ib--) - '0' : 0;
            res.append(carry % 2);
            carry = carry / 2;
        }
        return res.reverse().toString();
    }
}

