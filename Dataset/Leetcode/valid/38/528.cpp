 class Solution {
public:
    string ans[35] = {"", "1"};

    void work(string &s, int cnt, char c) {
        s += (char)cnt + '0';
        s += c;
        return;
    }

    void func(string &s1, string &s2) {
        int cnt = 1; // 相邻的字符数量
        for (int i = 1; i < s1.size(); i++) {
            if (s1[i - 1] == s1[i]) {
                cnt++;
            } else {
                // 向s2中加入几个什么的操作
                work(s2, cnt, s1[i - 1]); // cnt个s1[i - 1]
                cnt = 1; // 新的开始
            }
        }
        work(s2, cnt, s1[s1.size() - 1]); // 手动添加最后一个字符
        return;
    }

    string XXX(int n) {
        // 法一：通过上一项求下一项，正常遍历找到连续的几个几，把几个加到下一项，几也加到下一项
        // 法二：非主流做法，打表。把每一项用手写出来
        for (int i = 2; i <= n; i++) {
            func(ans[i - 1], ans[i]);
        }
        return ans[n];
    }
};

