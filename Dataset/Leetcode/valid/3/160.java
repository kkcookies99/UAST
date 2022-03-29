class Solution {
    public int XXX(String s) {
        int len = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            int olen = 0;
            for (int j = index; j <= i; j++) {
                if (i>j && s.charAt(i) == s.charAt(j)){
                    index = j+1;
                    break;
                } 
                olen++;
            }
            len = Math.max(olen,len);
        }
        return len;
    }
}

