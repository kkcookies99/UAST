 class Solution {
    public String XXX(String a, String b) {
        int a_length = a.length()-1;
        int b_length = b.length()-1;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while (  a_length >= 0 || b_length >= 0 || carry !=0 ) {

            int a_val = a_length < 0 ? 0 : a.charAt(a_length) - '0';
            int b_val = b_length < 0 ? 0 : b.charAt(b_length) - '0';

            int sum = carry + a_val + b_val;

            s.insert(0,(char)(sum%2+'0'));
            carry = sum / 2;

            if ( a_length >= 0) a_length--;
            if ( b_length >= 0) b_length--;
        }
        return s.toString();
    }
}

