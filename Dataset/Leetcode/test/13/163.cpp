class Solution {
public:
    int toNum(char s){
        switch(s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
    int XXX(string s) {
        
        int n = s.size();
        string::iterator p1 = s.end();
        string::iterator p2 = s.end();
        p2--;
        if(n == 1){
            return toNum(*p2);
        }
        p1--;
        int num1=0,num2 = 0;
        int res = toNum(*p2);
        while(1<n--){
            p1--;
            num1 = toNum(*p1);
            num2 = toNum(*p2);
            res +=(num1<num2?-num1:num1);
            p2--;
        }
        return res;
    }
};

