 class Solution {
public:
    char SIGN[4][2] = {{'I', 'V'}, {'X', 'L'}, {'C', 'D'}, {'M', ' '}};
    string transfer(int num, int sign){ //num: 0-9
        if(num == 0) return "";
        else if(num < 10){
            if(num < 4){
                return string(num, SIGN[sign][0]);
            }else if(num == 4){
                return string(1, SIGN[sign][0]) + string(1, SIGN[sign][1]);
            }else if(num < 9){
                return string(1, SIGN[sign][1]) + string(num-5, SIGN[sign][0]);
            }else{
                return string(1, SIGN[sign][0]) + string(1, SIGN[sign+1][0]);
            }
        }
        return "";
    }
    string XXX(int num) {
        string res = "";
        string numstr = to_string(num);
        int n = numstr.size();
        for(int i = 0; i < n; ++i){
            res += transfer(numstr[i] - '0', n -1 - i);
        }
        return res;
    }
};

