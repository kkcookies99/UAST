 class Solution {
public:
    // s：字符串
    // start：寻找位置
    // end：终止位置
    // c：寻找的字符
    // index：该字符在 s 中的位置
    bool find(const string &s, int start, int end, char c, int &index) {
        for (int i = start; i < end; ++i)
            if (c == s[i]) {
                index = i;
                return true;
            }
        return false;
    }

    int XXX(string s) {
        if (s.size() == 0) return 0;                       // 如果为空串，直接返回 0
        int max = 1, p = 0, index = 0;                     // max 储存最大值，p 表示可能的最大子串的起始位置，index 存储重复字符的位置
        for (int i = 1; i < s.size(); ++i)                 // 遍历字符
        {
            if (find(s, p, i, s[i], index)) p = index + 1; // 如果找到重复的字符，更新位置 p
            max = max > i - p + 1? max : i - p + 1;        // 更新 max
        }
        return max;                                        // 返回结果
    }
};

