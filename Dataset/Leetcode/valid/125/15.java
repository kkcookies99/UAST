 class Solution {
    public boolean XXX(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);
    }
}

