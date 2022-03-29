class Solution {
public:
    int XXX(string s) {
        int maxDigitNum = 10;
        int len = 0;
        long result = 0;
        int ptr = 0;
        int sign = 1;

        // step 1 strip empty space
        while(ptr <= s.size()){
            if(s[ptr] == ' '){
                ptr++;
            }
            else{
                break;
            }
        }

        // step 2 check sign
        if(s[ptr]=='+'){
            sign = 1;
            ptr++;
        }
        else if(s[ptr]=='-'){
            sign = -1;
            ptr++;
        }

        // step 3 read numbers
        // first get rid of the zeros in the front
        while(ptr<s.size()){
            if(s[ptr]=='0'){
                ptr++;
            }
            else{
                break;
            }
        }

        while(ptr<s.size()){
            if(s[ptr]>='0' && s[ptr]<='9'){
                // exceed largest digit size
                if(len>maxDigitNum){
                    break;
                }
                result *= 10;
                result += (s[ptr]-'0');
                len++;
                ptr++;
            }
            else{
                break;
            }
        }

        result *= sign;

        // step 4 check range
        if((result>>31) > 0){
            return (1<<30)-1+(1<<30);
        }
        if((result>>31) < -1){
            return (1)<<31;
        }

        return result;
    }
};

