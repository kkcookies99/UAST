class Solution {
public:
    int XXX(string s) {
        int res = 0;
        int len = s.length();
        for(int i = 0; i<len; ++i){
            switch (s[i]){
                case 'C':
                    res+= i+1<len&&(s[i+1]=='D'||s[i+1]=='M') ? -100:100;
                    break;
                case 'X':
                    res+= i+1<len&&(s[i+1]=='L'||s[i+1]=='C') ? -10:10;
                    break;
                case 'I':
                    res+= i+1<len&&(s[i+1]=='V'||s[i+1]=='X') ? -1:1;
                    break;
                case 'M':
                    res+= 1000;
                    break;
                case 'D':
                    res+= 500;
                    break;
                case 'L':
                    res+= 50;
                    break;
                case 'V':
                    res+= 5;
                    break;
            }     
        }
        return res;
    }
};

