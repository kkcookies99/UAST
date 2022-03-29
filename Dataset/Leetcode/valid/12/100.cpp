 class Solution {
public:
    string XXX(int num) {
        // 先把个，十，百，千的对应表列出来
        const char *ge[] = {
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
        };
        const char *shi[] = {
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
        };
        const char *bai[] = {
            "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
        };
        const char *qian[] = {
            "", "M", "MM", "MMM"
        };

        string ret = "";
        int count = 1;
        while (num != 0) {
            int data = num % 10;
            string str;
            if (count == 1) { // 个位
                ret = ge[data] + ret;
            } else if (count == 10) { // 十位
                ret = shi[data] + ret;
            } else if (count == 100) { // 百位
                ret = bai[data] + ret;
            } else if (count == 1000) { // 千位
                ret = qian[data] + ret;
            }
            num /= 10;
            count *= 10;
        }

        return ret;
    }
};

