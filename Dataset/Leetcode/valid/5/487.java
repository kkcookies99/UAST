 class Solution {
    public String XXX(String s) {
        if(s.length()<=1){
            return s;
        }    
        int max=s.length();
        while(max>0){
            for(int i=0,j=max;j-i==max&&j<=s.length();i++,j=max+i){
                if(isTrueString(s.substring(i,j))){
                    return s.substring(i,j);
                }
            }
            --max;
        }
        return s.charAt(0)+"";
    }
    //判断是否是回文子串
    public boolean isTrueString(String s){

        if(s==null||s.length()<=1){
            return false;
        }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}

