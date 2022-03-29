class Solution {
    public int XXX(String s) {
   String temp=s.trim();
   int res=0;
   for(int i=temp.length()-1;i>=0;i--){
       if(temp.charAt(i)==' '){
           break;
       }else{
           res++;
       }
   }
   return res;
    }
}

