 class Solution {
    public boolean XXX(String s) {
        String regEx = "[^a-zA-Z0-9]";
        String str1 = s.replaceAll(regEx, "").toUpperCase();
        String str2 = new StringBuilder(str1).reverse().toString();   
        return str1.equals(str2);

    }
}


