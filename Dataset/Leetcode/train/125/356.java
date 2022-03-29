 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.trim().length() <= 0) {
            return true;
        }
        if (s.length() == 1) {
            return true;
        }

        int i = 0, j = s.length() - 1;
        while(i < j) {
            while(i<j && (s.charAt(i) + "").matches("[^a-zA-Z\\d]")) i++;
            while(i<j && (s.charAt(j) + "").matches("[^a-zA-Z\\d]")) j--;
            if (!(s.charAt(i)+"").equalsIgnoreCase(s.charAt(j)+"")) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

