class Solution {
    public boolean XXX(int x) {
        if(x < 0) {return false;}

        String s = String.valueOf(x);
        int len = s.length();
        for (int i = 0, j = len -1; i< len; i++,j--) {
            if(i>j) {break;}
            if( s.charAt(i) != s.charAt(j)) {return false;}
        }

        return true;
    }
}

code block

