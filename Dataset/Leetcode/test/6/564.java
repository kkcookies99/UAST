 class Solution {
    public String XXX(String s, int numRows) {
        if(s == null || s.length() == 1 || numRows == 1) return s ;

        StringBuilder str = new StringBuilder(s.length());

        for(int i = 0 ,index = i; i < numRows && index < s.length(); i++ ,index = i){

            str.append(s.charAt(index));

            while (index < s.length()){

                if( i != 0 && i != numRows-1 && index + (numRows*2-2) - i*2 < s.length() ) str.append(s.charAt(index + (numRows*2-2) - i*2));

                index += (numRows*2-2);

                if(index < s.length()) str.append(s.charAt(index));

            }

        }
        return str.toString();
    }
}

