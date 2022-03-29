 class Solution {
public:
    int XXX(string s) {
        int res=0,len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s[i] != ' '){
                res = ++len;
            }else{
                if(res)
                    break;
            }
        }
        return res;
    }
};

