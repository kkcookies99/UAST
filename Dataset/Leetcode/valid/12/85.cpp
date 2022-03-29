 class Solution {
    void update(int bound, int num, string &s, char a, char b, char c) {
        if (num >= bound) {
            int x = num / bound;
            if (x == 9) {
                s.push_back(c);
                s.push_back(a);
                x -= 9;
            }
            if (x >= 5) {
                s.push_back(b);
                x -= 5;
            }
            if (x == 4) {
                s.push_back(c);
                s.push_back(b);
                x -= 4;
            }
            s += string(x, c);
        }
    }
public:
    string XXX(int num) {
        string s= "";
        int bound = 1000; 
        while(bound >= 1) {
            if (bound == 1000) update(bound, num, s, '?', '?', 'M');
            else if (bound == 100) update(bound, num, s, 'M', 'D', 'C');
            else if (bound == 10) update(bound, num, s, 'C', 'L', 'X');
            else if (bound == 1) update(bound, num, s, 'X', 'V', 'I');
            num = num % bound;
            bound = bound / 10;
        }
        return s;
    }
};

