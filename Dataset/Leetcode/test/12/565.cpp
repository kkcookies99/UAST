 class Solution {
public:
    string XXX(int num) {
        string ans;
        vector<string> Roman = { "I","V", "X", "L", "C", "D", "M" };
        vector<int> digit;
        int len = -1;                   //len记录传入的num的位数
        for (; num != 0; num /= 10) {
            len++;
            digit.push_back(num % 10);  //把每位数字倒序存入vector<int> digit里
        }

        for (; len != -1; len--) {      //根据位数进行接下来的处理：以个位为例
            int start = len * 2;        //start用于确定当前位数所需要的罗马数字。个位需要的是I,V,X三个数字
            int m = digit[len] / 5, n = digit[len] % 5;       //digit ÷ 5 = m ... n（余数）
            if (n == 4) {                                         //特判：类似IV或者IX的情况
                ans += Roman[start] + Roman[start + m + 1];       //m==0是IV，m==1是IX
            }
            else {
                if (m) {                        //如果大于等于5，填充一个V
                    ans += Roman[start + m];
                }
                for (; n != 0; n--) {           //填充n个I
                    ans += Roman[start];
                }
            }
        }
        return ans;
    }
};

