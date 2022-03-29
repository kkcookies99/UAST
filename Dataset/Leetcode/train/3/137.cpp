 class Solution {
public:
    int XXX(string s) {
        vector<int> hashMap(256, -1); // 取巧一下 所有字符转int 不超过256
        int max = 0;
        int length = s.size();
        int leftCur = 0;
        for (int i = 0; i < length; i++) {
            if (hashMap[s[i]] >= leftCur) {// 如果这里的索引大于左游标 说明左游标右侧出现了重复字符 因此左游标直接跳到上一次字符出现的位置+1
                leftCur = hashMap[s[i]] + 1;
            }
            hashMap[s[i]] = i; // 每次都更新字符对应的索引位置

            if (i - leftCur + 1 > max)
                max = i - leftCur + 1;
        }
        return max;
    }
};


