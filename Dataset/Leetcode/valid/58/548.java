class Solution {
    public int XXX(String s) {
             int res=0;
            int index=s.lastIndexOf(" ");
            if(index==-1) return s.length();

            if(index != s.length()-1){
                res=s.length()-1-index;
            }else{
                int temp=0;
                for(int i=index-1;i>=0;i--){
                    if(s.charAt(i) != ' ' && s.charAt(i+1) == ' '){
                        temp=i;
                    }
                    if(s.charAt(i) != ' ' && (i-1<0 || s.charAt(i-1)==' ' )){
                        res=temp-i+1;
                        break;
                    }
                }
            }
            return res;
    }
}

