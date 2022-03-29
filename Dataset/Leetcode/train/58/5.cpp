 class Solution {
public:
    int XXX(string s) {
        int i=s.size()-1;
        while(s[i]==' ') i--;//去掉末尾的空格
        int end=i;
        while(i--){
            if(s[i]==' ') break;
        }
        return end-i;
    }
};

