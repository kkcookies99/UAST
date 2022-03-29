 class Solution {
    public boolean XXX(int x) {
        String s = Integer.valueOf(x).toString();
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }
}

