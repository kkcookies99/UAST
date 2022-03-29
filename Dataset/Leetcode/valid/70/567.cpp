class Solution {
public:
    int XXX(int n) { // 直接迭代，不用额外空间
        if (n <= 3) return n;
        int n1 = 1, n2 = 0;
        int number;
        for (int i = 2; i <= n+1; i++){
            number = n1 + n2;
            n2 = n1;
            n1 = number; 
        }
        return number;
    }
};

