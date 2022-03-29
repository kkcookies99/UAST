 class Solution {
public:
    int XXX(string s) {
        if(s.size() == 0) return 0;
        int length = 0;
        for(int i = s.size(); i > 0; --i){
            if(i == s.size()){
                while(i > 0 && s[i-1] == ' ')
                    --i;
            }
            if(i > 0 && s[i-1] == ' ')
                break;
            if(i > 0) ++length;
        }
        return length;
    }
};

