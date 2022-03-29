class Solution {
public:
    bool isdigit(char c){
        return c>='0' && c<='9'; 
    }

    int XXX(string str) {
        int int_min = -2147483648;
        int int_max = 2147483647;
        long ret = 0;
        int state = 0;
        for (char c:str){
            switch(state){
                case 0:{
                    if(c==' '){
                        continue;
                    }
                    else if(c == '+'){
                        state = 1;
                    }   
                    else if(c == '-'){
                        state = 2;
                    }
                    else if(isdigit(c)){
                        ret = ret*10+(c-'0');
                        state  = 3;
                    }
                    else{
                        return 0;
                    }
                    break;
                }

                case 1:{
                    if(isdigit(c)){
                        state = 4;
                        ret = 10*ret+(c-'0');
                    }
                    else{
                        return 0;
                    }
                    break;
                }
                case 2:{
                    if(isdigit(c)){
                        state = 5;
                        ret = 10*ret-(c-'0');
                    }
                    else{
                        return 0;
                    }
                    break;
                }
                case 3:{
                   if(isdigit(c)){
                       ret = 10*ret+(c-'0');
                   }
                   else {
                       return ret;
                   }
                   break;
                }

                case 4:{
                     if(isdigit(c)){
                        ret = 10*ret+(c-'0');
                    }else {
                        return ret;
                    }
                    break;
                }

                case 5:{
                     if(isdigit(c)){
                        ret = 10*ret-(c-'0');
                    }else {
                        return ret;
                    }
                    break;
                }


            
            }
            if (ret >int_max){
                return int_max;
            }
            if(ret<int_min){
                return int_min;
            }
        }
        return ret;
    }
};

