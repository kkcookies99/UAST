 class Solution {
public:
    int XXX(int x) {
        bool negtive = x<0;
        int s = 0, temp;
        x = abs(x);
        while (x) {
            temp = 10*s;
            // 判断溢出
            if (temp%10) return 0;
            s = temp + x%10;
            x /= 10;
        }
        if (negtive) s=-s;
        return s;
    }
};

