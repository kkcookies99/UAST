 class Solution {
public:
    bool XXX(int x) {
        if(x < 0 || (x >0 && x%10 == 0))
            return false;
        int num = 0;
        while(x > num)
        {
            num = num*10 + x%10;
            x /= 10;
        }
        return x == num || x == num/10;
    }
};

