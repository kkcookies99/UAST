class Solution {
    public int XXX(String s) {
        int len = s.length();
        while(s.charAt(len - 1) == ' ') len--;
        int ans = 0;
        for(int i = len - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') return ans;
            ans++;
        }
        return ans;
    }
}

