 class Solution {
    public String XXX(String a, String b) {
        StringBuilder sbd = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int x = i >= 0 ? a.charAt(i--) - '0' : 0;
            int y = j >= 0 ? b.charAt(j--) - '0' : 0;
            sbd.append((x + y + carry) % 2);
            carry = (x + y + carry) >= 2 ? 1 : 0;
        }
        if(carry > 0) sbd.append(carry);
        return sbd.reverse().toString();
    }
}



