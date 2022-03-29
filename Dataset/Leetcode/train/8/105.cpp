class Solution {
public:
    int XXX(string str) {
        long result = 0;
        bool isUint = true;
        bool isStart = true;
        for (int i =0; i < str.size(); ++i) {
            if (str[i] == ' ' && isStart) {
                continue;
            } else if (str[i] == '-' && isStart) {
                isStart = false;
                isUint = false;                
            } else if (str[i] == '+' && isStart) {
                isStart = false;
                isUint = true;                
            }else if (str[i] >='0' && str[i] <='9') {
                isStart = false;
                result = result*10 + (str[i]-'0');
                if (result != (int)result){
                    if (isUint) {
                        return INT_MAX ;
                    } else {
                        return INT_MIN ;
                    }
                }
            } else {
                break;
            }
        }
        if (!isUint) {
            result = 0-result;
        }

        return result;
    }
};

