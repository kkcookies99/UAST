 class Solution {
    public boolean XXX(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (true) {
            while (i <= s.length()-1 && !isRightWord(str[i])) {
                i++;
            }
            while( j>=0 && !isRightWord(str[j])) {
                j--;
            }
            if (j <= i) {
                break;
            }
            if (Character.toLowerCase(str[i])!=Character.toLowerCase(str[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isRightWord(char c){
        return (c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z');
    }
}

