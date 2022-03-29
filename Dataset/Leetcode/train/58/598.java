class Solution {
    public int XXX(String s) {
        int n = s.length();
        int count=1;

        for(int i=n-1;i>0;i--){

           if(s.charAt(i)!=' ' &&s.charAt(i-1)!=' ' ){
               count++;
           }
           if(s.charAt(i)!=' ' &&s.charAt(i-1)==' ' ){
               break;
           }
        }
        return count;
    }
}

