 class Solution {
public:
    int XXX(string str) {
        bool isF = false;
        int i = 0;
        long long sum = 0;
        while (str[i] == ' ') {
            i++;
        }
        if ((str[i] != '-' && str[i] != '+') && (str[i] < '0' || str[i] > '9')) {
            return 0;
        }
        
        if (str[i] == '-') {
            isF = true;
            i++;
        } else if (str[i] == '+') {
            i++;
        }
        for ( ; i < str.length(); i++) {
            if (str[i] < '0' || str[i] > '9') {
                break;
            }
            if (isF) {
                if (sum > INT_MAX / 10 || (sum == INT_MAX / 10 && (str[i] - '0') > 8)) {
                    return INT_MIN;
                }
            } else {
                if (sum > INT_MAX / 10 || (sum == INT_MAX / 10) && (str[i] - '0') > 7) {
                    return INT_MAX;
                }
            }
            sum = sum * 10 + (str[i] - '0');
        }
        return isF == true ? sum * -1 : sum;
    }
};

