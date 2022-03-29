class Solution {
public:
    int XXX(string s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.at(i);

            if(c == 'I')
            {
                if(s.length() > i + 1 && (s.at(i+1) == 'V' || s.at(i+1) == 'X')) {
                    num -= 1;
                }
                else {
                    num += 1;
                }
            }
            else if(c == 'V')
            {
                num += 5;
            }
            else if(c == 'X')
            {
                if(s.length() > i + 1 && (s.at(i+1) == 'L' || s.at(i+1) == 'C')) {
                    num -= 10;
                }
                else {
                    num += 10;
                }
            }
            else if(c == 'L')
            {
                num += 50;
            }
            else if(c == 'C')
            {
                if(s.length() > i + 1 && (s.at(i+1) == 'D' || s.at(i+1) == 'M')) {
                    num -= 100;
                }
                else {
                    num += 100;
                }
            }
            else if(c == 'D')
            {
                num += 500;
            }
            else if(c == 'M')
            {
                num += 1000;
            }
            else {
                num += 0;
            }
        }
        return num;
    }
};

