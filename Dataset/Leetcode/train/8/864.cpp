 class Solution {
public:
int XXX(string str) {
	int tmp_hex = 0, sign = 1, i = 0;
	string result;
    if(str[0] == ' '){
        while(str[i] == ' ') 
            i++;
    }
    if(str[i] == '+' || str[i] == '-'){
            sign = str[i] == '+' ? 1: -1;
            i++;
        }
    while(str[i] >= '0' && str[i] <= '9'){
        if(tmp_hex > INT_MAX/10 && sign == 1)
            return INT_MAX;
        if(tmp_hex == INT_MAX/10 && (str[i]-'0') > 7 && sign == 1)
            return INT_MAX;
        if(tmp_hex < INT_MIN/10 && sign == -1)
            return INT_MIN;
        if(tmp_hex == INT_MIN/10 && (str[i] - '0') > 8 && sign == -1)
            return INT_MIN;
        if(sign == 1)
            tmp_hex = tmp_hex * 10 + (str[i] - '0');
        else
            tmp_hex = tmp_hex*10 - (str[i] - '0');
        i++;
    }
    if(str[i] == '.' ){
        return tmp_hex;
        }
	return tmp_hex;
}
};

