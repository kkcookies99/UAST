class Solution {
public:
    bool XXX(int x) {
        //首先，负数肯定不是回文数
        if(x < 0)
            return false;
        double reverse_num = 0;
        int num = x;
        int r;
        while(x != 0)
        {
            r = x % 10;
            x = x / 10;
            reverse_num = reverse_num * 10 + r;
        }
        return num == reverse_num ? true : false;
    }
};

