 class Solution {
    public boolean XXX(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}

