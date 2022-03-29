 class Solution {
public:
    int XXX(string haystack, string needle) {
        // 如果needle是空字符串，则返回0
        if (needle.empty()) {
            return 0;
        }
        // 获得needle的长度，作为滑动窗口大小
        size_t winLen = needle.size();
        if (haystack.empty() || needle.size() > haystack.size()) {
            return -1;
        }
        // 初始化一个空字符串，作为比较的变量
        for (int i{0}; i <= haystack.size() - winLen; i++) {
            string temp(haystack, i, winLen);
            if (temp == needle) {
                return i;
            }
        } 
        return -1;
    }
};

