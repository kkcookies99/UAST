 class Solution {
    public String XXX(String a, String b) {
        int m = a.length(), n = b.length();
        int num1 = 0, num2 = 0, carry = 0,sum = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = m - 1, j = n - 1; i >= 0 || j >= 0 || carry > 0; i--, j--){
            num1 = i >= 0? (a.charAt(i) - '0') : 0;
            num2 = j >= 0? (b.charAt(j) - '0') : 0;
            sum = num1 + num2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}

