 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            while(i < s.length() && !Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(j >= 0 && !Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))){
                j--;
            }
            if(i >= j){
                return true;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

