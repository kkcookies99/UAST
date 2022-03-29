class Solution {
public:
    int XXX(string s) {
        int nstrlen = s.length();
        int num = 0;
        char ch1, ch2;
        for(int i = nstrlen-1; i >= 0; i--){
            if(i == nstrlen-1){
                ch1 = s[i];
                num += StrToInt(ch1);
            }
            else{
                ch1 = s[i];
                ch2 = s[i+1];
                if(StrToInt(ch1) >= StrToInt(ch2)){
                    num += StrToInt(ch1);
                }
                else{
                    num -= StrToInt(ch1);
                }
            }
        }
        return num;
    }

    int StrToInt(char c){
        int n;
        switch(c){
            case 'I':n = 1;break;
            case 'V':n = 5;break;
            case 'X':n = 10;break;
            case 'L':n = 50;break;
            case 'C':n = 100;break;
            case 'D':n = 500;break;
            case 'M':n = 1000;break;
        }
        return n;
    }
};

