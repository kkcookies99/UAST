 class Solution {
public:
    char isAbcorNumber(char s){
        //判断是不是字母或数字 
        if('A'<=s&&s<='Z'){
            //转化成小写
            s+=32;
            //Z与a之间隔了6位符号
            return s;
        }else if(('0'<=s&&s<='9')||('a'<=s&&s<='z')){
            return s;
        }
        return '#';
    }
    bool XXX(string s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char c1=isAbcorNumber(s[start]);
            char c2=isAbcorNumber(s[end]);
            while(start<end&&c1=='#'){
                start++;
                c1=isAbcorNumber(s[start]);
            }
            while(start<end&&c2=='#'){
                end--;
                c2=isAbcorNumber(s[end]);
            }
            if(c1!=c2){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
};

