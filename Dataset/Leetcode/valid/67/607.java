class Solution {
    public String XXX(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder str = new StringBuilder();
        while(i >= 0 || j >= 0){
            if(i >= 0 && a.charAt(i--) == '1') carry++;
            if(j >= 0 && b.charAt(j--) == '1') carry++;
            str = str.append((char)('0'+carry % 2 )) ;
            carry /= 2;
        }
        if(carry == 1) str = str.append("1");
        return str.reverse().toString();
    }
}

