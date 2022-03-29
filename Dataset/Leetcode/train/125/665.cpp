 class Solution {
public:
    bool XXX(string s) {
       int i=0,j=s.size();
       string tmp;
       while(i<j){
           if(isdigit(s[i])||islower(s[i])){
               tmp=tmp+s[i];
             // tmp+=s[i];
           }
           else if(isupper(s[i])){
                tmp+=(s[i]+32);
           }
           i++;
       } 
       for(int i=0;i<tmp.size()/2;i++){
           if(tmp[i]!=tmp[tmp.size()-i-1])
            return false;
       }
       return true;
    }
};

