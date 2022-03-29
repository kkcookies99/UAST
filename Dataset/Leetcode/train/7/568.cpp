 class Solution {
public:
    int XXX(int x)
    {
        int res = 0;
        /*x左移完成*/
        while (x)
        {
            /*下一次右移将越界*/
            if (res > INT32_MAX /10 || res < INT32_MIN /10) return 0;
            /*右移+余*/
            res = res*10 + x%10;
            /*左移*/
            x /= 10;
        }

        return res;
    }
};

