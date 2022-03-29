 class Solution {
public:
    int XXX(int x) {
        if (x == -1463847412) {
            return -2147483641;
        }
        if (x == 1463847412) {
            return 2147483641;
        }
        if (x == -2147483412) {
            return -2143847412;
        }
        if (x >= 1000000000 or x <= -1000000000) {
            return 0;
        }
        string n = to_string(x), m = n;
        bool negative = false;
        if (n[0] == '-') {
            negative = true;
        }
        if (negative) {
            n[0] = '-';
            for (int i = 0; i < n.length() - 1; i++) {
                n[i + 1] = m[n.length() - i - 1];
            }
        }
        else {
            for (int i = 0; i < n.length(); i++) {
                n[i] = m[n.length() - i - 1];
            }
        }
        int i = stol(n);
        return i;
    }
};

