 class Solution {
    public boolean XXX(String s) {
        int begin = 0;
        int end = s.length() - 1;
        boolean beginWaited = false;
        boolean endWaited = false;
        while(begin <= end){
            if(!isRealChar(s.charAt(begin))){
                begin++;
                continue;
            }else{
                beginWaited = true;
            }
            if(!isRealChar(s.charAt(end))){
                end--;
                continue;
            }else{
                endWaited = true;
            }
            if(changeChar(s.charAt(begin)) == changeChar(s.charAt(end))){
                beginWaited = false;
                endWaited = false;
                begin++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean isRealChar(char c){
        if(c >= 'A' && c <= 'Z'){
            c -= ('A' - 'a');
        }
        if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }

    public char changeChar(char c){
        if(c >= 'A' && c <= 'Z'){
            c -= ('A' - 'a');
        }
        return c;
    }
}

