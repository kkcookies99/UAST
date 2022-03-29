 class Solution {
    public int XXX(String s) {
        int n = s.length()-1;
        while(s.charAt(n)==' ') n--;
        int i = 0;
        while(n>=0&&s.charAt(n--)!=' ') i++;
        return i;
    }
}

