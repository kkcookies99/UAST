 class Solution {
public:
    int XXX(string s) {
        auto e=s.end();
        e--;
        int ret=0;
        while(*e==' '){
        if(e==s.begin())
        break;
        e--;
        }
        while(e!=s.begin()){
            if(*e==' ')
            break;
            ++ret;
            e--;
        }
       if(*e!=' ')
       ret++; 
        return ret;
    }
};

