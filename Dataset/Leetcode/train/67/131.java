 class Solution {
    public String XXX(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int m = a.length() - 1, n = b.length() - 1;
        while(m >= 0 || n >= 0){
            int temp = carry;
            if(m >= 0) temp += a.charAt(m--) - '0';
            if(n >= 0) temp += b.charAt(n--) - '0';
            carry = temp / 2;
            res.append(temp % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}

