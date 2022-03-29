class Solution {
    public int XXX(String s) {
        if(s == null || s.length() == 0) return 0;
        int last = s.length()-1;
        int le = 0;
        for(int i = last; i>=0; i--){
           if(s.charAt(i) == ' '){
               if(le == 0) continue;
              break;
        }
         le++;
        
    }
      return le;

    }
}
