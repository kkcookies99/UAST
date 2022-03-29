 class Solution {
public:
    int XXX(string s) {
       int i=0;
          char sign='+';string num="";
       while(s[i]==' '){
           ++i;
       }
       if(s[i]=='-'||s[i]=='+'){
           sign=s[i];
           ++i;
       } 
        while(s[i]>=48&&s[i]<=57){
            num+=s[i++] ;
        }
        if(num==""){return 0;}
       
       try{
         return sign=='-'?-stoi(num):stoi(num);
       }
       catch(std::out_of_range){
           return sign=='-'?-2147483648:2147483647;
       } 
    }
};

