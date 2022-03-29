 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] charArray = s.toCharArray();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            if ( (charArray[i] >= 'A' && charArray[i] <= 'Z') || 
                (charArray[i] >= 'a' && charArray[i] <= 'z') ||
                (charArray[i] >= '0' && charArray[i] <= '9') ) {
                    sb1.append(charArray[i]);
                }
        }
        for (int j = charArray.length-1; j >=0; j--) {
            if ( (charArray[j] >= 'A' && charArray[j] <= 'Z') || 
                (charArray[j] >= 'a' && charArray[j] <= 'z')  ||
                (charArray[j] >= '0' && charArray[j] <= '9') ) {
                    sb2.append(charArray[j]);
                }
        }
        if (sb1.length() != sb2.length()) {
            return false;
        }
        for (int i = 0; i < sb1.length(); i++) {
            if ( (sb1.charAt(i) >= '0' && sb1.charAt(i) <= '9') &&
                (sb1.charAt(i) != sb2.charAt(i)) ) {
                return false;
            }
            if (sb1.charAt(i) != sb2.charAt(i) && 
                Math.abs(sb1.charAt(i)-sb2.charAt(i)) != 32) {
                return false;
            }
        }
        return true;
    }
}

