 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();
        int len = s.length();
        char[] chs = s.toCharArray();
        for(int i = 0, j = len - 1; i < j;){
            while(i < j && !isOk(chs[i])){
                i++;
            }
            while(i < j && !isOk(chs[j])){
                j--;
            }
            if(chs[i] != chs[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isOk(char ch){
        return Character.isDigit(ch) || (ch >= 'a' && ch <= 'z');
    }
}