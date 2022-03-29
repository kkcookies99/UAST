 class Solution {
    public boolean XXX(int x) {
        int i = 0;
        String str_x = String.valueOf(x);
        char[] char_x = str_x.toCharArray();
        int j = str_x.length()-1;
        while (i <= j) {
            if (char_x[j] != char_x[i]) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}

