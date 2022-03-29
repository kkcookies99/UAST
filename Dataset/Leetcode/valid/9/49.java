class Solution {
    public boolean XXX(int x) {
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer(s);
        String s2 = sb.reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != sb.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

