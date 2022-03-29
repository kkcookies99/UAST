 class Solution {
    public int XXX(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;
            int last = i;
            while(i + 1 < s.length() && s.charAt(i + 1) != ' ') i++;
            res = i - last + 1;
        }
        return res;
    }
}

