class Solution {
public:
    int XXX(string s) {
        int cnt = 0;
        int i = s.size()-1;
        while(i >= 0 && s[i] == ' ')
        {
            i --;
        }
        while(i >= 0 && s[i--] != ' ') cnt ++;
        return cnt;
    }
};

