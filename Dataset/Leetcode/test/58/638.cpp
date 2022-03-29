class Solution {
public:
    int XXX(string s) {
        while(s.size() && s.back() == ' ') s.pop_back();
        int cnt = 0;
        for(auto c:s){
            if(c == ' ') cnt = 0;
            else cnt++;
        }
        return cnt;
    }
};

