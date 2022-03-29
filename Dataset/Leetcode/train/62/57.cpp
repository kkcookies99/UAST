 class Solution {
public:
    int XXX(int m, int n) {
        int totalCombination = (m+n-2);
        int smallOne = min(m, n);
        smallOne--;
        long numerator = 1;
        long denominator = 1;

        for(int i=0;i<smallOne;i++){
            denominator *= (i+1);
            numerator *= (totalCombination-i);
        }

        return (numerator/denominator);
    }

};

