 class Solution {
    public boolean XXX(String s) {
        
        String lowerS = s.toLowerCase();
        
        int j = lowerS.length() - 1;

        for(int i = 0 ; i < lowerS.length() ; ){

            char chi = lowerS.charAt(i);
            char chj = lowerS.charAt(j);
            if(i >= j){
                return true;
            }

            if(!isNumericOrChar(chi)){
                i ++ ;
                continue;
            }
            if(!isNumericOrChar(chj)){
                j -- ;
                continue;
            }

            if(chi != chj){
                return false;
            }
            i ++;
            j --;
        }
      
        return true;
    }

     public boolean isNumericOrChar(char ch){
        return (ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122);
    }

}

