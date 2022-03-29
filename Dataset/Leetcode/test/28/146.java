 class Solution {
    public int XXX(String haystack, String needle) {
            if(needle.length()==0) return 0;
            int[] next=new int[needle.length()];
            next[0]=0;
            for(int i=1,j=0;i<needle.length();i++){
                while(j>0 && needle.charAt(i)!=needle.charAt(j)){
                    j=next[j-1];
                }
                if(needle.charAt(i)==needle.charAt(j)){
                    j++;
                }
                next[i]=j;
            }

           for(int i=0,j=0;i<haystack.length();i++){
               while(j>0 && haystack.charAt(i)!=needle.charAt(j)){
                   j=next[j-1];
               }
               if(haystack.charAt(i)==needle.charAt(j)){
                   j++;
               }
               if(j==needle.length()){
                   return i-j+1;
               }
           }
           return -1; 
    }
}
