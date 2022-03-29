class Solution {
    public boolean XXX(int x) {
        String a = String.valueOf(x);
        StringBuffer sbf = new StringBuffer().append(x).reverse();
        return a.equals(sbf.toString());
    }
}

