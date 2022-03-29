 class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false;
        String s = Integer.toString(x);
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.toCharArray()[i] != s.toCharArray()[length - i -1]){
                return false;
            }
        }
        return true;
    }
}

