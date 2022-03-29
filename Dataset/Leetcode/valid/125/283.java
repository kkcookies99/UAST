 class Solution {
    public boolean XXX(String s) {
        if(s.length() == 0) return true;
        if(s == null) return false;
       
        return new StringBuffer(
            s.replaceAll("[^a-zA-Z0-9]",""))
            .reverse()
            .toString()
            .equalsIgnoreCase(s.replaceAll("[^a-zA-Z0-9]",""));
    }
}

