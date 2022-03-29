 class Solution {
    public String XXX(String a, String b) {
       StringBuilder s=new StringBuilder();
       int la=a.length(),lb=b.length();
       char[] wa=a.toCharArray();
       char[] wb=b.toCharArray();
       int i=la-1,j=lb-1;
       int f=0;
       while(i>=0||j>=0){
           int wordA=0;
           int wordB=0;
           if(i>=0){
               wordA=wa[i]-'0';
               i--;
           }
           if(j>=0){
               wordB=wb[j]-'0';
               j--;
           }
            s.insert(0,(wordA+wordB+f)%2);
            f=(wordA+wordB+f)/2;
        }
        if(f==1){
            s.insert(0,1);
        }
        return s.toString();
    }
}

