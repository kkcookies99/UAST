class Solution {
   public int XXX(String s) {
       int max = Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;
       int conut=0;
       for(char c: s.toCharArray()){
           if(c!=' ') break;
           else conut++;
       }
       char c[] = s.substring(conut, s.length()).toCharArray();
       if(c.length==0) return 0;
       int res=0;
       int flag=1;
       int i=0;
       if(c[0]=='-') {
           flag=-1;
           i=1;
       }
       if(c[0]=='+'){
           i=1;
       }
       for(;i<c.length;i++){
          if(c[i]>='0'&&c[i]<='9'){
              if(flag==1&&((max-c[i]+'0')/10)<res){
                return max;
              }
              if(flag==-1&&((min+c[i]-'0')/10>-res)){   
                 return Integer.MIN_VALUE;
              }
              else{
                  res = c[i]-'0'+res*10;
              }
              
          }
          else break;
       }
       return res*flag;
    }
}

