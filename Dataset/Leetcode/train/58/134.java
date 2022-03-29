 class Solution {
    public int XXX(String s) {
        if(s==null || s.length()==0 ||){
            return 0;
        }
        
        int end = s.length();
        while((s.charAt(end-1)==' ') && (end > 1)){
            end -= 1;
        }
        int start = end;
        for(; start > 0 ; start--){
            if(s.charAt(start-1) == ' ')
                break;
        }
        return end-start;
    }
}

