class Solution {
    public String XXX(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        var sb = new StringBuilder();
        int p = 0;
        int carry = 0;
        while(p<lenA || p<lenB){
            int digitA = lenA-1-p;
            int digitB = lenB-1-p;
            int temp =carry;
            if(digitA>=0){
                temp+=a.charAt(digitA)-'0';
            }
            if(digitB>=0){
                temp+=b.charAt(digitB)-'0';
            }
            if(temp >= 2){
                temp -= 2;
                carry = 1;
            }else{
                carry = 0;
            }
            sb.append(temp);
            p++;
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}

