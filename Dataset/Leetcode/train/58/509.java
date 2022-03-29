class Solution {
    public int XXX(String s) {
        s = s.trim();
        //System.out.println(s);
        int ans = 0;
        int idx = s.length() - 1;
        while(idx >= 0 && s.charAt(idx) != ' '){
            ans++;
            idx--;
        }
        return ans;
    }
}

