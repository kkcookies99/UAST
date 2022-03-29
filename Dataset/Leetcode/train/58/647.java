class Solution {
    public int XXX(String s) {
       if(s.length() == 0) return 0;
        int end = s.length()-1;
        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }
        for(int i=end;i>=0;i--){
            if(s.charAt(i) == ' ') {
                return end-i;
            }
        }
        return end+1;
    }
}

