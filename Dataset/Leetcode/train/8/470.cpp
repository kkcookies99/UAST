 class Solution {
public:
    int XXX(string s) {
        if(s.size()==0) return 0;
        long int ans=0;
        char symbol='+';
        int l=0;
        while(s[l]==' '){
            l++;
        }
        if(s[l]=='-'){
            symbol='-';
            l++;
        }
        else if(s[l]=='+'){
            symbol='+';
            l++;
        }
        if(s[l]<'0'||s[l]>'9') return 0;
        while(l<s.size()&&s[l]>='0'&&s[l]<='9'){
            ans = ans*10 + (s[l]-'0');
            l++;
            if(ans>INT_MAX){if(symbol=='-') return INT_MIN;else return INT_MAX;}
        }
        return (symbol=='-'?int(-ans):int(ans));
    }
};

