class Solution {
public:
    int XXX(string str) {
        int i = 0;
        while(str[i] == ' ') ++i;
        if(str[i] != '-' && str[i] != '+' && !(str[i] >= '0' && str[i] <= '9'))
            return 0;
        
        bool neg_flag = false;
        if(str[i] == '-'){
            neg_flag = true;
            ++i;
        }
        else if(str[i] == '+'){
            neg_flag = false;
            ++i;
        }
        
        long long sum = 0;
        bool isFlow = false;
        for(; i < str.size(); i++){
            if(!(str[i] >= '0' && str[i] <= '9')) break;
            
            sum = sum * 10 + (str[i] - '0');
            if(sum > INT_MAX){
                sum = INT_MAX;
                isFlow = true;
                break;
            }
        }
        
        if(neg_flag){
            if(isFlow)
                return INT_MIN;
            
            return -sum;
        }
        
        return sum;
    }
};

