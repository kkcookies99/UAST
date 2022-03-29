 class Solution {
    public int XXX(int x) {
            String s = String.valueOf(x);
            StringBuilder str = new StringBuilder();
              if(s.charAt(0)=='-'){
                    str.append('-');
                 for(int i= s.length()-1 ; i>0 ;i--){
                    str.append(s.charAt(i));
                 }
            }
              else{
                for(int i= s.length()-1 ; i>=0 ;i--){
                     str.append(s.charAt(i));
                 }
            }
        s = str.toString();
        Long a = Long.parseLong(s);
        if (a< -Math.pow(2,31) || a> Math.pow(2,31)-1){
            return 0;
        }
        return Integer.parseInt(s);
    
    }
}

