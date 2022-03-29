class Solution {
public:
    int XXX(int x) {
        if (x == -2147483648)
            return 0;
        int temp[10], p1 = 0, p2 = 0;
        bool flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }

        while (x != 0) {
            temp[p2++] = x % 10;
            x = x / 10;
        }
        --p2;
        while (temp[p1] == 0) {
            ++p1;
        }

        if (p2 - p1 == 9) {//判断是否越界2147483647
            int themax[] = { 2,1,4,7,4,8,3,6,4,7 };
            for (int i = 0; i < 10; ++i) {
                if (temp[i] > themax[i]) { return 0; }
                if (temp[i] < themax[i])
                    break;
            }
        }
        int ans = 0;
        while (p2>=p1) {
            ans = ans * 10 + temp[p1++];
        }


        if (flag)
            return -ans;
        else
            return ans;
    }
};