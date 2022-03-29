class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
    }
}