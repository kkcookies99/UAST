class Solution {
    public String XXX(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int tem = 0;
        while(len1 >= 0 || len2 >= 0) {
             tem = ((len1>=0)?(a.charAt(len1)-'0'):0) + ((len2>=0)?(b.charAt(len2)-'0'):0) + carry;
            carry = tem / 2;
            tem = tem % 2;
            sb.append(tem);
            len1--;
            len2--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();

    }
}

