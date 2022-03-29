 class Solution {
    public boolean XXX(String s) {
        String newS = s.toLowerCase();
        boolean res = true;
        for (int i = 0, j = newS.length() - 1; i <= j; i++, j--) {
            while (Character.isDigit(newS.charAt(i)) == false && Character.isLowerCase(newS.charAt(i)) == false && i + 1 <= j) {
                i++;
            }
            while (Character.isDigit(newS.charAt(j)) == false && Character.isLowerCase(newS.charAt(j)) == false && i <= j - 1) {
                j--;
            }
            if (newS.charAt(i) != newS.charAt(j)) {
                res = false;
                break;
            }
        }
        return res;
    }
}

