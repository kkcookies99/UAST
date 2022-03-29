 class Solution {
    public boolean XXX(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        return String.valueOf(new StringBuilder(s).reverse()).toUpperCase().equals(s.toUpperCase());
    }
}

