 class Solution {
    public boolean XXX(String s) {
        if (s == null)    return false;
        String pure = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = pure.length() - 1;
        while (i < j) {
            if (pure.charAt(i++) != pure.charAt(j--))
                return false;
        }
        return true;
    }
}

