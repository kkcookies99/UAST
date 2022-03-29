 class Solution {
    public String XXX(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int carry = 0, i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i >= 0) carry += a.charAt(i--)-'0';
            if(j >= 0) carry += b.charAt(j--)-'0';
            sb.append(carry%2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}

