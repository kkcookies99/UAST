class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        int n=0;
        while(n!=len/2){
            if(s.charAt(n) == s.charAt(len-n-1)) n++;
            else return false;
        }
        return true;
    }
}

