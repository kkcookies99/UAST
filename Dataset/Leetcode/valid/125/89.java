 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase().replaceAll("[^(a-zA-Z0-9)]", "");
        String ss = new StringBuffer(s).reverse().toString();
        if(s.equals(ss)){
            return true;
        }
        else return false;
    }
}

