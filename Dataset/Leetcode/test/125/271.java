 class Solution {
    public boolean XXX(String s) {
        s = s.toUpperCase().replaceAll("[^0-9a-zA-Z]","");
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }
}

