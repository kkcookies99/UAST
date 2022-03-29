class Solution {
public:
    int XXX(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2){
            return 2;
        }
        
        int m1 = 1, m2 = 2;
        
        int i = 3;
        int sum = 0;
        while (i <= n) {
            sum = m1 + m2;
            
            m1 = m2;
            m2 = sum;

            i++;
        }
        return sum;
    }
};

