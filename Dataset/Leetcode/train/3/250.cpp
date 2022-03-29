 class Solution {
public:
    int XXX(string s) {
        int index[256] = { 0 };
        for (int i = 0; i < 256; ++i) {
            index[i] = -1;
        }
        int maxLength = 0;
        int curLength = 0;
        // index 保存字母最大索引位置，并且实时更新
        // 检查 index[s[i]] 是否落在 [i-currentLength, i)
        // 如果在，则 currentLength = i - index[s[i]]; 然后更新 maxLength，再更新 index[s[i]]
        // 如果不在，currentLength++
        for (int i = 0; i < s.length(); ++i) {
            if (i - curLength <= index[s[i]]) {
                curLength = i - index[s[i]];
            } else {
                curLength++;
            }
            index[s[i]] = i;
            maxLength = maxLength < curLength ? curLength : maxLength;
        }
        return maxLength;
    } 
};

