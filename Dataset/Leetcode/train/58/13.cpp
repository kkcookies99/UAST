 class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        int res = 0;
        for(int i = n-1; i >= 0; i--){
            if(s.at(i)==' ') continue;
            else {
                while(i >=0 && s.at(i) != ' '){
                    res++;
                    i--;
                }
                return res;
            }
        }
        return 0;
    }
};

