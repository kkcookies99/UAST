class Solution {
    public boolean XXX(int x) {
        String in = String.valueOf(x);
        int i = 0;
        int j = in.length() - 1;
        while (i < j) {
            if (in.charAt(i++) != in.charAt(j--)) return false;
        }
        return true;
    }
}