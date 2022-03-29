 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.length() == 0)
            return true;
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) 
                return false;
        }
        return true;
    }
}
法二：
class Solution {
    public boolean XXX(String s) {
        if (s == null || s.length() == 0)
            return true;
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-1-i))
                return false;
        }
        return true;
    }
}

