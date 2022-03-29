class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            stringBuilder.append(c);
        }
        String str = stringBuilder.toString();
        return str.equals(s);
    }
}

