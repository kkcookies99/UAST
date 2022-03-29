 class Solution {
public:
    bool XXX(string s) {
       int p1=0;
       int p2=s.length();
       while(p1 < p2){
           if(s[p1]<'0'||(s[p1]>'9'&&s[p1]<'A')||(s[p1]>'Z'&&s[p1]<'a')||s[p1]>'z'){
               p1++;
               continue;
           }
           if(s[p2]<'0'||(s[p2]>'9'&&s[p2]<'A')||(s[p2]>'Z'&&s[p2]<'a')||s[p2]>'z'){
               p2--;
               continue;
           }

           if((s[p1]>='0'&&s[p1]<='9')||(s[p2]>='0'&&s[p2]<='9')){

               if(s[p1]!=s[p2]) return false;
               else{
                   p1++;
                   p2--;
                   continue;
               }
           }
           if(s[p1]==s[p2] || s[p1]-s[p2]==32 || s[p2]-s[p1]==32 ){
               p1++;
               p2--;
           }
           else{
               return false;
           }
       }
       return true;
    }
};

