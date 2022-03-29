 class Solution {
    public String XXX(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if(lena == 0) return b;
        if(lenb == 0) return a;
        int carry = 0;
        int i = lena-1;
        int j = lenb-1;
        StringBuilder sb = new StringBuilder();
        while(i!=-1 || j!=-1){
            if(i!=-1){
                carry += Integer.valueOf(a.substring(i,i+1));
                i--;
            }
            if(j!=-1){
                carry += Integer.valueOf(b.substring(j, j+1));
                j--;
            }
            sb.append(carry%2);
            carry = carry/2;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}

