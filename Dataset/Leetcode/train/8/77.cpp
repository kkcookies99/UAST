class Solution {
public:
    int XXX(string str) {
        state  = init;
        res = 0;
        for(auto & c : str){
            if(process(c) != GoOn) break;
        }
        return res;
    }
    int process(const char & c){
        switch(state){
            case init:
                return processInit(c);
            break;
            case positive:
                return processPositive(c);
            break;
            case negative:
                return processNegative(c);
            break;
            default:
            break;
        }
        return 0;
    }
    int processInit(const char & c){
        if(c == ' ') return GoOn;
        if(isalpha(c)) return Done;
        if(c == '-'){
            state  = negative;
            return GoOn;
        }
        if(c == '+'){
            state = positive;
            return GoOn;
        }
        if( isdigit(c)){
            res = c-'0';
            state = positive;
            return GoOn;
        }
        return Done;
    }
    int processPositive(const char& c){
        if(!isdigit(c)) return Done;
        long val = (long)res*10 + c-'0';
        if(val >= INT_MAX){
            res = INT_MAX;
            return Done;
        }
        res = val;
        return GoOn;
    }
    int processNegative(const char & c ){
        if(!isdigit(c)) return Done;
        long val = (long)res*10 - (c-'0');
        if(val <= INT_MIN){
            res = INT_MIN;
            return Done;
        }
        res = val;
        return GoOn;
    }
    enum STATE{
        init,
        positive,
        negative,
    };
private:
    int res = 0;
    int state = STATE::init;
    const int Done = -1;
    const int GoOn = 0;
};

