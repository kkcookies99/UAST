 class Solution {
    public boolean XXX(String s) {
        if(s.length()==0) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equalsIgnoreCase(String.valueOf(new StringBuilder(s).reverse()));
    }
}

