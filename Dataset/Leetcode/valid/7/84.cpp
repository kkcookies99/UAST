class Solution {
public:
    int XXX(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > INT_MAX / 10 || rev == INT_MAX / 10 && pop > INT_MAX - INT_MAX / 10) return 0;
            if (rev < INT_MIN / 10 || rev == INT_MIN / 10 && pop < INT_MIN - INT_MIN / 10) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
};

