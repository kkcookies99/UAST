 class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        int i = a.length()-1, j = b.length()-1;
        while ( i >=0 || j >= 0 || carry ) {
            // 省略了补0操作，直接赋值
            char aa = i >= 0 ? a.charAt(i) : '0';
            char bb = j >= 0 ? b.charAt(j) : '0';
            int sum = aa - '0' + bb - '0';
            if ( carry ) {
                sum ++;
                carry = false;
            }
            if ( sum > 1 ) {
                carry = true;
                sb.append(sum%2);
            } else {
                sb.append(sum);
            }
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}

