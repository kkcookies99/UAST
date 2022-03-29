 class Solution {
public:
    //变一下字符串
    string changeArray(string s) {
        string c = "#";
            for (int i = 0; i < s.size(); i++) {
                c += s[i];
                c += "#";
            }
        return c;
    }
    //把字符串变回来。。。
    string getArray(string s) {
        string g;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] != '#')g += s[i];
        }
        return g;
    }
    string XXX(string s) {
        if (s.size() == 1)return s;//欸
        int index, max = 0, R = -1, C = -1, cen=0;
        string h = changeArray(s);//变一下数组
        vector<int> help(h.size());//申请一个辅助空间
        for (int i = 0; i != h.size(); i++) {//进入循环
            help[i] = R > i ? min(help[2 * C - i], R - i) : 1;//如果回文最右边界超过正在计算的位置，直接返回数值，不用计算
            while (i + help[i]<h.size() && i - help[i]>-1) {//暴力结算。。。
                if (h[i + help[i]] == h[i - help[i]])help[i]++;
                else break;
            }
            if (i + help[i] > R) {//记录最右边界
                R = i + help[i];
                C = i;
            }
            if (help[i] > max) {//记录一下需要的数据
                max = help[i];
                cen = i;
            }
        }
        return getArray(h.substr(cen - max+1, 2 * max - 1));//返回成品
    }
};

