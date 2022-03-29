 class Solution {
    public boolean XXX(String s) {
        if ("".equals(s)){
            return true;
        }
        String replace = s.replaceAll("\\W", "").replace("_", "").toLowerCase();
        StringBuilder res=new StringBuilder(replace);
        String s1 = res.reverse().toString();
        return s1.equals(replace);
    }
}

