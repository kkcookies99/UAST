class Solution {
public:
    int XXX(string s) {
        int lastWordLength = 0;
        int i = s.length();
        while (i--) {
            if (s[i] != ' ') {
                    ++lastWordLength;
            }
            else if(s[i] == ' ' && lastWordLength != 0) {
                    break;
            }
        }
        return lastWordLength;
    }
};

