class Solution {
public:
    int XXX(int m, int n) {
        long re = 1;
        int max = m > n ? m : n;
        int min = m < n ? m : n;
        for(int i = max + min - 2; i > max - 1; i--)
            re *= i;
        for(int i = 1; i < min; i++)
            re /= i;
        return re;
    }
};

