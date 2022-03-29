class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = 0;

        while (i < a.length() || i < b.length()) {
            int sum = carry;

            if (i < a.length()) sum += a.charAt(a.length() - 1 - i) - '0';
            
            if (i < b.length()) sum += b.charAt(b.length() - 1 - i) - '0';
        
            sb.append(sum % 2);
            carry = sum / 2;
            i++;
        }
        if (carry > 0 ) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}

