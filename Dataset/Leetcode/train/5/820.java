 class Solution {
    public String XXX(String s) {
         //暴力
         int max=1;
         int begin=0;
         for(int i=0;i<s.length();i++){
             for(int j=i;j<s.length();j++){
                 if(j-i+1>max&&valid(i,j,s)){
                     max=j-i+1;
                     begin=i;
                 }
             }
         }
         return s.substring(begin,begin+max);
    }
    public boolean valid(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return false;
        }
        return true;
    }
}

