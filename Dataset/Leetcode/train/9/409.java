 class Solution {
    public boolean XXX(int x) {
        if (x < 0) {
            return false;
        }
        if (x<10){
            return true;
        }
        if (x%10==0){
            return false;
        }

        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for (int j = chars.length - 1, i = 0; i <= j; j--, i++) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}

