 class Solution {
public:
    int XXX(string s) {
     int n=s.size();
     int i=0;
     int flag=1;
     int ans=0;
     while(s[0]==' '){
      s.erase(0,1);
     }
     if(s[0]=='-'){
        flag=-1;
        i++;
        s.erase(0,1);
     }
     if(s[0]=='+'){
        flag=1;
        i++;
        s.erase(0,1);
     }
     if(i==2){return 0;}
     for(char c:s){
         //if(isspace(c)){break;}
         if(isdigit(c)){
          //ans=ans*10+(c-'0');
          if(ans>(long long)INT_MAX/10||(ans==(long long)INT_MAX/10&&(c-'0')>7)){
          return flag>0?INT_MAX:INT_MIN;}
          //i++;
          ans=ans*10+(c-'0');
         }
         else{break;}
     }
     return flag>0?ans:-ans;
    }
};

