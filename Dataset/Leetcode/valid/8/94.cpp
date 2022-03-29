class Solution {
public:
    int XXX(string s) {
        int flag = 1;
        int i= 0;
        int sum = 0;
        while(s[i] == ' ') i++ ;
        int j = i;
        while(s[j]){
            int char_n = s[j];
            if(j ++ ==i){
                if(char_n == '-') {flag = -1; continue;}
                if(char_n == '+') {flag = 1; continue;}
                if(char_n < '0' || char_n > '9')return 0;
            }else if (char_n < '0' || char_n > '9') break;
            if(sum> INT_MAX/10 || (sum == INT_MAX/10 && char_n > '7')  ) return INT_MAX;
            if(sum< INT_MIN/10 || (sum == INT_MIN/10 && char_n > '8')  ) return INT_MIN;
            sum = sum *10 + (char_n-'0')*flag;
        }
        return sum;
    }
};

