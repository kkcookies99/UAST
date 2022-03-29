 class Solution {
    public int XXX(int x) {
        String s = String.valueOf(x);
        StringBuilder s1 = new StringBuilder(s);
        if (s1.charAt(0) == '-') {
            StringBuilder s2 = new StringBuilder(s1.substring(1));
            int i = 0;
            try {
                i = Integer.parseInt("-" + Integer.parseInt(String.valueOf(s2.XXX())));
            } catch (NumberFormatException e) {
                i = 0;
            }
            return i;
        } else {
            int j = 0;
            try {
                j = Integer.parseInt(String.valueOf(s1.XXX()));
            }catch (NumberFormatException e){
                j = 0;
            }
            return j;
        }
    }
}

