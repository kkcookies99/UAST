 class Solution {
public:
    int XXX(int x) {
        long long sum = 0;
        int tmp = x;
        int count = 0;
        while (tmp){
            tmp /= 10;
            count++;
        }
        while (x){
            int t = x % 10;
            sum += t * pow(10,--count);
            x /= 10;
        }
        if (sum >= INT_MAX || sum <= INT_MIN)
            return 0;
        return sum;
    }
};

