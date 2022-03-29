class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        if (x < 10) {
            return true;
        }
        String str = x+"";
        //"56411336"  "15699651" "1235321"
        char[] chars = str.trim().toCharArray();
        int len = chars.length;
        int middle = len / 2;
        for (int i = 0; i < middle; i++) {
            int head = chars[i];
            int tail = chars[len - 1 - i];
            if (head != tail) {
                return false;
            }
        }
        return true;
    }
}

