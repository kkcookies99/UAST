 public boolean XXX(String s) {
        int length = s.length();
        int left = 0 , right = length -1 ;
        char[] sChars = s.toUpperCase().toCharArray();
        while(left < right){
            while( !isLetter(sChars[left]) && left < right ) left += 1;
            while( !isLetter(sChars[right]) && left < right ) right -= 1;
            if( sChars[left] != sChars[right]) return false;
            left +=1;
            right -=1;
        }
        return true;
    }
    public boolean isLetter(char c){
        return c<='Z' && c>='A' || c<='9' && c>='0';
    }

