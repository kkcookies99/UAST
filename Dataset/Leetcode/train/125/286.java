 class Solution {
    public boolean XXX(String s) {
        boolean flag = true;
        String news = "";
        for (char ch : s.toCharArray()) {
            if ( (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') ) {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch - 'A' + 'a');
                }
                news += ch;
            }
        }
        for (int l = 0, r = news.length()-1; l < r; l++, r--) {
            if (news.charAt(l) != news.charAt(r)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

