class Solution {
    public boolean XXX(int x) {
        String str = String.valueOf(x);
        String str2 = new StringBuffer(str).reverse().toString();
        if (str.equals(str2))
            return true;
        else
            return false;
    }
}

