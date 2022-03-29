 class Solution {
    public int XXX(String s) {
       int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i);
            if (c != ' '){
                count++;
            }else if (count != 0){
                return count;
            }
        }
        return count;
    }
}

