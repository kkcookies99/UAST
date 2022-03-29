class Solution {
public:
    int XXX(int n) {
        int n1 = 1, n2 = 1;
        for(int i = 1; i < n ; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        } 
        return n2;
    }
};

