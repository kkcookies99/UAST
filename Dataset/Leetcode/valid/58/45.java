 class Solution {
    public int XXX(String s) {
        int index = s.lastIndexOf(" ");

        if ( index == -1 ) {
            return s.length();
        }
        if ( index == 0 ) {
            s = s.replace(" ","");
            return s.length();
        }

        while ( index == s.length()-1 ) {
            s = s.substring(0,index);
            index = s.lastIndexOf(" ");
            if ( index == 0 ) {
                s = s.replace(" ","");
                return s.length();
            }
        }

            s = s.substring(index + 1);
            return s.length();
    }
}

