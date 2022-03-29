 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while (i <= j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (!Character.isAlphabetic(a)&&!Character.isDigit(a)) {
                i++;
                continue;
            }
            if (!Character.isAlphabetic(b)&&!Character.isDigit(b)) {
                j--;
                continue;
            }
            if (a==b) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }
}

