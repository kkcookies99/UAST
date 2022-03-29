 class Solution {
public:
    int XXX(string s) 
    {
        int count = s.size()-1;
        int cnt = 0;
        while(count >= 0 && s[count] == ' ')
            count--;
        while(count >= 0 && s[count] != ' ')
        {
            count--;
            cnt++;
        }
        return cnt;
    }
};

