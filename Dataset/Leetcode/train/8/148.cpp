class Solution {
public:
    int XXX(string s) {
        int state = 0;          //0代表未读入数字，1代表正在读入数字
        int zf;                 //代表正负
        long long num = 0;
        for(char i : s){ 
            if( i == ' ' && state == 0)
                continue;
            if( (i >= 48 && i < 58) && state == 1 )
                {   num = num*10 + (i - 48); 
                    if(num*zf < INT_MIN)
                        {return INT_MIN;}
                    if(num*zf > INT_MAX)
                        {return INT_MAX;}
                    continue;
                } 

            if( (i == '+' || (i >= 48 && i < 58) ) && state == 0){
                zf = 1;
                state = 1;
                if(i > 48 && i < 58)
                   { num +=  i - 48; }
                continue;
            }
            else if(i == '-' && state == 0){
                zf = -1;
                state = 1;
                continue;
            }    

            if( !(i >= 48 && i < 58) && (state == 1 || state == 0))
                break;
            }
        
        return num*zf;
    }
};

