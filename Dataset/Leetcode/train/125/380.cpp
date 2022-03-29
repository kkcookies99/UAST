 class Solution {
public:
    bool ischar(char a){
        return (a>='a' && a<='z') || (a>='A' && a<='Z') ||(a>='0' && a<='9');
    }
    bool isnum(char a){
        return (a>='0' && a<='9');
    }
    bool XXX(string s) {
        int slow=0,fast= s.length()-1;
        while(slow < fast){
            while(slow < fast && !ischar(s[slow]))slow++;
            while(slow < fast && !ischar(s[fast]))fast--;
            if(isnum(s[slow]) && isnum(s[fast])){  //判断两个数字的情况
                if(s[slow]!=s[fast])return false;
            }
            if(s[slow]!=s[fast] && abs(s[slow]-s[fast])!=32)return false;  //判断字母和字母以及字母和数字
            if(isnum(s[slow])!=isnum(s[fast]))return false; //排除一方是字符，一方是数字且两者的ascii码差值恰好为32的情况
            slow++;
            fast--;
        }
        return true;
    }
};

