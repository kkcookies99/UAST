class Solution {
    public String XXX(String a, String b) {
        char[] chsA = a.toCharArray(), chsB = b.toCharArray();
        int i = chsA.length-1, j = chsB.length-1;
        int x = 0, y = 0, sum = 0, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            x = i>=0 ? chsA[i]-'0' : 0;
            y = j>=0 ? chsB[j]-'0' : 0;
            sum = (x+y+carry)&1;
            carry = (x+y+carry)>>1;
            sb.append(""+sum);
            i--;
            j--;
        }
        if(carry != 0)
            sb.append(""+carry);
        return sb.reverse().toString();
    }
}

