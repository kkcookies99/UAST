 class Solution {
    public boolean XXX(String s) {
        if (null == s) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = String.valueOf(new StringBuilder(s).reverse());
        return s.equalsIgnoreCase(reverse);
    }
}

