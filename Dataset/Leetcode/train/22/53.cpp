 class Solution {
public:
    void process(vector<string>& s, int n, string res = "", int rem = 0) {
        if (n == 0 && rem == 0) {//base case 不用多解释了吧
            s.push_back(res);
            return;
        }
        if (n != 0) {//还有左括号可以加
            process(s, n - 1, res + "(", rem + 1);//加左括号的路线
            if (rem != 0) {
                process(s, n, res + ")", rem - 1);//加右括号的路线
            }
        }else if (rem != 0) {
            process(s, n, res + ")", rem - 1);//左括号没得加了，只能把右括号加完
        }
    }
    vector<string> XXX(int n) {
        vector<string> s;
        process(s, n);
        return s;
    }
};

