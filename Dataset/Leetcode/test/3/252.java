 class Solution {
    public int XXX(String s) {
        int maxLength = 0;
        int start = 0;
        int p = 1;
        int length = 1;

        int index = 0;

        if(s.length() < 2){
            return s.length();
        }
        
        while(p < s.length()){
            index = s.indexOf(s.charAt(p), start);
            if(index < p){
                //在窗口内
                start = index+1;
                length = p - index;
            }else{
                ++length;
            }
            if(length > maxLength){
                maxLength = length;
            }

            ++p; 
        }
        
        return maxLength;
        
    }
}

