class Solution {
    public int XXX(String s) {
        String ns = s.trim();
        if("".equals(ns))return 0;
        if(!ns.contains(" "))return ns.length();
        return ns.substring(ns.lastIndexOf(" ")+1).length();
    }
}

