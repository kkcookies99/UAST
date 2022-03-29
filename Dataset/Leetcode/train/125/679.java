 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.length() == 0)
            return true;
        String str = s.replaceAll("[^0-9a-zA-Z]", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if ((str.charAt(i) & 0xDF) != (str.charAt(str.length() - 1 - i) & 0xDF))
                return false;
        }
        return true;
    }
}

