class Solution {
    public String XXX(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            res.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if(carry != 0){
            res.append(carry);
        }
        res.reverse();
        return res.toString();
    }
}

