 class Solution {
    public boolean XXX(String s) {
        if(s.length() == 1 || s.length() == 0) return true;
        String sL = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if(sL.charAt(i) == sL.charAt(j)) {
                i++;
                j--;
            }
            else {
                if(((sL.charAt(i) >= 48 && sL.charAt(i) <= 57) || (sL.charAt(i) >= 97 && sL.charAt(i) <= 122)) && ((sL.charAt(j) >= 48 && sL.charAt(j) <= 57) || (sL.charAt(j) >= 97 && sL.charAt(j) <= 122))){
                    return false;
                }
                else if((sL.charAt(i) >= 48 && sL.charAt(i) <= 57) || (sL.charAt(i) >= 97 && sL.charAt(i) <= 122)) {
                    j--;
                }
                else if((sL.charAt(j) >= 48 && sL.charAt(j) <= 57) || (sL.charAt(j) >= 97 && sL.charAt(j) <= 122)) {
                    i++;
                }else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}

