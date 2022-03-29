class Solution {
public:
    int XXX(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        int t1 = min(m, n) - 1;
        int t2 = max(m, n) - 1;
        long long temp = 1;
        int t = t1 + t2;
        //cout << 
        for(int i = 0; i < t1; i++){
            temp *= t;
            t--;
        }
        for(int i = 0; i < t1; i++){
            temp /= i + 1;
        }
        return temp;
    }
};

