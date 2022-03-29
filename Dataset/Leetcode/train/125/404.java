 class Solution {
    public boolean XXX(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(str[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(str[j])) {
                j--;
            } else {
                if (Character.toLowerCase(str[i]) == Character.toLowerCase(str[j])) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

