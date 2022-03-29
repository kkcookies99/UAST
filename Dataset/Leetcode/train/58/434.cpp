class Solution {
public:
    int XXX(string s) {
        int res=0;
        while(s.back()==' '){ s.pop_back(); }
        while(!s.empty()&&s.back()!=' '){
            res++;
            s.pop_back();
        }
        return res;
    }
};

