class Solution {
public:
    int XXX(int n) {
        if (n < 4)
            return n;
        long long a = 2;
        long long b = 3;
        long long c = 5;
        while (n-- >= 4){
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }
};

