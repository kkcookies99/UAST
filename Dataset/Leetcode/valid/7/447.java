 class Solution {
    public int XXX(int x) {
        int rev = 0;
        while(x != 0){
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = 10 * rev + x%10;

            x = x/10;
        }
        return rev;

    }
}

