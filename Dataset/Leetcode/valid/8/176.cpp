class Solution {
public:
    int XXX(string str) {
        int result=0;
        char c,d;
        string ret;
        for (int i=0;i<str.size();i++){
            c=str[i];
            
            if(c!='+' & c!='-' & !isspace(c) & !isdigit(c) ){
                return 0;
            }
            if (c=='+'| c=='-'){
                if (i==str.size()-1) return 0;
                if (!isdigit(str[i+1]))return 0;
                for (int j=i+1;j<str.size();j++){
                    
                    d=str[j];
                    
                    if (isdigit(d)) {
                        ret=ret+d;
                    }else{break;}
                }
                break;
            }
            if (isdigit(c)){
                for (int j=i;j<str.size();j++){
                    d=str[j];
                   
                    if (isdigit(d)) {
                        ret=ret+d;
                    }else{break;}
                }
                break;
            }
        
        }
       
        
        if (c=='+'| isdigit(c)){
            try{
                result=stoi(ret);
            }catch(...){
            return INT_MAX;
        }
        }
        if (c=='-'){
            try{
                result=-stoi(ret);
            }catch(...){
              return INT_MIN;  
            }
        }
        return result;
    

        
    }
};


