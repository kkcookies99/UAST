 class Solution {
    public boolean XXX(String s) {
        if(s.isEmpty()){
            return true;
        }
        String news = s.trim().toLowerCase();
        char[] chars = new char[news.length()];
        int i=0;
        char[] charSplit = news.toCharArray();
        for(char ch: charSplit){
            if(('0'<=ch && '9'>= ch) || ('a'<=ch && 'z'>=ch)){
                chars[i]=ch;
                i++;
            }
        }
        int end = i-1;
        for(int j=0; j<(i/2); j++){
            if(chars[j] != chars[end]){
                return false;
            }
            end--;
        }


        return true;
    }
}

