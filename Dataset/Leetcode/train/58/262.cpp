 class Solution {
public:
    int XXX(string s) {
        reverse(s.begin(),s.end());
        int cnt = 0;
        for(int i =0;i < s.size(); i++) {
            if(s[i] != ' '){
                cnt ++;
            }
            else {
                if(cnt != 0) break;
                else continue;
            }
        }
        return cnt;
    }
};

