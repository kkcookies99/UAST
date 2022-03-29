class Solution {
public:
   bool XXX(int x) {
       if (x < 0) return false;
       //防止反转后溢出
       long long i = 0, j = x;
       while (true) {
           i = i * 10 + j % 10;
           if ((j /= 10) == 0) break;
       }
       return x == i;
   }
};

