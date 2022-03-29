 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 1;

        int i = 0, j = 0;

        while (j < s.length()&&i <= j) {
            if((j+1) < s.length() && s.substring(i,j+1).contains(String.valueOf(s.charAt(j+1)))) {
                result = Math.max(result, j-i+1);
                i = s.substring(i, j+1).indexOf(String.valueOf(s.charAt(j+1)))+1+i;
            }
           
            j++;
            result = Math.max(result, j-i);
        }
        return result;
    }
}

