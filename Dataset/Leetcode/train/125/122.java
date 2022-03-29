 class Solution {
    public boolean XXX(String s) {
        int n=s.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;++i){
           if(Character.isLetterOrDigit(s.charAt(i))){
               sb.append(Character.toLowerCase(s.charAt(i)));
           }
        }
        String ans=sb.toString();
        boolean flag=true;
        for(int i=0;i<ans.length()/2;i++){
            if(ans.charAt(i)!=ans.charAt(ans.length()-1-i)){
                flag=false;
                break;
            }
        }
        return flag;
    }
}

