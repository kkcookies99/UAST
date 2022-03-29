class Solution {
public:
    int XXX(int n) {
        //n3 = n2+1 = n1+2
        //f(n3)= f(n2) + f(n1)
        int n1=1, n2=2, n3=3;

        if (n == 1) return n1;
        if (n == 2) return n2;
        for (int i=2; i<n; i++) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }

        return n3;

    }
};

