 class Solution {
public:
    int XXX(string s) {
        if (s.empty())
            return 0;
        int n = 0;
        int len = s.size();
        for (int i = len-1; i > -1; i--){
            if (s.at(i)!=' ')
                n++;
            else if(n>0){
                return n;
            }
        }
        return n;
    }
};

