 class Solution {
    public boolean XXX(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
       String s1 =  new StringBuffer(s).reverse().toString();
       return s.toString().equals(s1.toString());

    }
}

